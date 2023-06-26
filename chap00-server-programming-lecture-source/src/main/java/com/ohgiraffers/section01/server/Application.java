package com.ohgiraffers.section01.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class Application {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8000);
        Socket client;
        while((client = serverSocket.accept()) != null){
//            new Thread(new Runnable() { /*익명 클래스*/
//                @Override
//                public void run() {
//
//                }
//            });
            Socket finalClient = client;
            new Thread(() -> { /* 람다 문법 */
                try {
                    BufferedReader br = new BufferedReader(new InputStreamReader(finalClient.getInputStream()));

                    /*
                    String line;
                    while((line = br.readLine()) != null){
                        System.out.println("line = " + line);
                    }
                    */

                    String generalHeader = br.readLine();
                    System.out.println("generalHeader = " + generalHeader);

                    String requestMethod = generalHeader.split(" ")[0];
                    String requestPath = generalHeader.split(" ")[1];

                    System.out.println("requestMethod = " + requestMethod);
                    System.out.println("requestPath = " + requestPath);

                    Map<String, String> requestHeader = new HashMap<>();
                    String line;
                    while((line = br.readLine()) != null){
                        //빈 공백라인이면 멈춤
                        if(line.isBlank()){
                            break;
                        }


                        String key = line.split(": ")[0];
                        String value = line.split(": ")[1];

                        requestHeader.put(key, value);
                    }
                    System.out.println("requestHeader = " + requestHeader);

                    //POST TEST
                    String body = null;
                    if("POST".equals(requestMethod)){
                        //포스트 방식으로 요청
                        //헤더 중에 content-length 몇바이트인지 알 수 있음

                        int contentLength = Integer.parseInt(requestHeader.get("Content-Length"));
                        char[] temp = new char[contentLength];
                        br.read(temp);
                        body = new String(temp).trim(); //trim : null 문자들 제거
                    }
                    System.out.println("body = " + body);

                    StringBuilder responseText = new StringBuilder();

                    if("/".equals(requestPath) && "GET".equals(requestMethod)){
                        String responseGeneralHeader = "HTTP/1.1 200 OK\r\n";
                        //프로토콜 응답상태
                        //추가적으로 밑에 헤더 적고 싶으면 적음
                        String contentType = "Content-Type: text/html; charset=UTF-8\r\n";
                        String whiteLine = "\r\n";

                        responseText.append(responseGeneralHeader);
                        responseText.append(contentType);
                        responseText.append(whiteLine);

                        //미리 작성된 html을 읽어줌
                        //읽을 때 스트림 이용

                        BufferedReader br2 = new BufferedReader(new FileReader("src/main/resources/index.html"));
                        String htmlLine = null;
                        while((htmlLine = br2.readLine()) != null){
                            responseText.append(htmlLine);
                        }

                        responseText.append(whiteLine);
                    }
                    System.out.println("responseText = " + responseText);
                    OutputStream out = finalClient.getOutputStream();
                    out.write(responseText.toString().getBytes());

                    out.flush();
                    out.close();

                    br.close();
                    finalClient.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }).start();
        }
    }
}