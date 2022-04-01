package ood.stackoverflowsystem.questions;

import ood.stackoverflowsystem.users.Member;

import java.util.Date;
import java.util.List;

public class Answer {

    private String text;
    private Date createdDate;
    private Date lastModifiedDate;
    private Member createdMember;
    private int voteCount;
    private int flagCount;
    private boolean accepted;
    private List<Photo> photos;
}
