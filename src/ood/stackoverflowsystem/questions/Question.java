package ood.stackoverflowsystem.questions;

import ood.stackoverflowsystem.constants.QuestionClosingRemark;
import ood.stackoverflowsystem.constants.QuestionStatus;

import java.util.Date;
import java.util.List;

public class Question {
    String title;
    String description;
    Date createDate;
    Date updateDate;
    QuestionStatus status;
    QuestionClosingRemark closingRemark;
    List<Photo> photos;
    Bounty bounty;
    List<Comment> comments;
    List<Answer> answers;
    int voteCount;
    int viewCount;
    public void close(){}
    public void delete(){}


}
