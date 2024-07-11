package mediatorDesignPattern.client;

import mediatorDesignPattern.components.ChatMember;
import mediatorDesignPattern.mediator.ChatMediator;
import mediatorDesignPattern.mediatorImpl.ChatEngine;

public class MediatorTest {

    public static void main(String[] args) {

        ChatMediator  chat = new ChatEngine();
        ChatMember member1 = new ChatMember("Abdalla",chat);
        ChatMember member2 = new ChatMember("Ahmed",chat);
        ChatMember member3 = new ChatMember("Younies",chat);

        chat.addChatMember(member1);
        chat.addChatMember(member2);
        chat.addChatMember(member3);
        System.out.println("*******  Abdalla send message *****");
        member1.sendMessage("Hi All");

        System.out.println("*******  Younies reply*****");

        member3.sendMessage("Hi Abdalla");

    }

}
