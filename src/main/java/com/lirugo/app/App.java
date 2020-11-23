package com.lirugo.app;


import com.lirugo.collection.HashMap;
import com.lirugo.collection.Map;

//import java.util.HashMap;
//import java.util.Map;

public class App {
    public static void main(String[] args){
        Map<Integer, Client> clients = new HashMap();
        clients.put(0, new Client(1, "John"));
        clients.put(1, new Client(2, "Jane"));

        int h;
        System.out.println( new Client(1, "John").hashCode());
        for(int i = 0; i < clients.size(); i++)
            System.out.println(clients.get(i).toString());
    }
}
