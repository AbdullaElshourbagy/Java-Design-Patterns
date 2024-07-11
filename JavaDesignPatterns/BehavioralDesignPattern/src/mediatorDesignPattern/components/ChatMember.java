package mediatorDesignPattern.components;

import mediatorDesignPattern.mediator.ChatMediator;

public class ChatMember {
    private String name;
    ChatMediator mediator;

    public ChatMember(String name, ChatMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public void sendMessage(String message) {
        mediator.notify(message, this);

    }

    public void receiveMessage(String message) {
        System.out.println("chat member name >>" + this.name + "  received msg : " + message);

    }
}
