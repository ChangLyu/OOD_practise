package ood.stackoverflowsystem.users;

import ood.stackoverflowsystem.questions.Answer;
import ood.stackoverflowsystem.questions.Badge;
import ood.stackoverflowsystem.questions.Question;
import ood.stackoverflowsystem.questions.Tag;

import java.util.List;

public class Member{
    Account account;
    List<Badge> badges;
    public void publishQuestion(Question question){}
    public void modifyQuestion(String questionId){}
    public void deleteQuestion(String questionId){}
    public void unDeleteQuestion(String questionId){}
    public void addComment(String questionId, String comments){}
    public void addAnswer(String questionId, Answer answer){}
    public void createTag(Tag tag){}
}
