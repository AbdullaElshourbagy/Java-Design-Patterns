package mediatorDesignPattern.mediatorImpl;

import mediatorDesignPattern.components.ChatMember;
import mediatorDesignPattern.mediator.ChatMediator;

import java.util.ArrayList;
import java.util.List;

public class ChatEngine implements ChatMediator {
    private List<ChatMember> chatMembers;

    public ChatEngine() {
        this.chatMembers = new ArrayList<ChatMember>();
    }

    @Override
    public void addChatMember(ChatMember member) {
        chatMembers.add(member);
    }

    @Override
    public void notify(String msg, ChatMember member) {
        this.chatMembers.stream().forEach(p ->
        {
            if (p != member) {
                p.receiveMessage(msg);
            }
        });
    }
}
