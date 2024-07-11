package mediatorDesignPattern.mediator;

import mediatorDesignPattern.components.ChatMember;

public interface ChatMediator {

    void addChatMember(ChatMember member);
    void notify(String msg, ChatMember member);
}
