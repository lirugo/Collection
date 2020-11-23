package com.lirugo.app;

import com.lirugo.collection.HashMap;
import com.lirugo.collection.Map;

public class App {
    public static void main(String[] args){
        Map<Integer, Client> clients = new HashMap();
        clients.add(0, new Client(1, "John"));

        for(int i = 0; i < clients.size(); i++)
            System.out.println(clients.get(i).toString());
    }
}
