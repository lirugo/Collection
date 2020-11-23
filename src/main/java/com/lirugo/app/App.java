package com.lirugo.app;


import com.lirugo.collection.HashMap;
import com.lirugo.collection.Map;

//import java.util.HashMap;
//import java.util.Map;

public class App {
    public static void main(String[] args){
        Map<String, Client> clients = new HashMap();
        clients.put("1", new Client(1, "John"));
        clients.put("2", new Client(2, "Jane"));
        clients.put("3", new Client(3, "Jack"));
        clients.put("4", new Client(4, "Jordan"));
        clients.put("5", new Client(5, "James"));
        clients.put("6", new Client(6, "Jacob"));

        for(int i = 1; i <= clients.size(); i++)
            System.out.println(clients.get(String.valueOf(i)).toString());
    }
}
