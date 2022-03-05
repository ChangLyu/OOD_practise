package ood.librarymanagement.dataaccess;

import ood.librarymanagement.model.Member;
import ood.librarymanagement.model.Person;

public class PersonRepository {
    public Member getMemberById(String memberId){
        return new Member();
    }

    public boolean updatePersonTotalBooksCheckedOut( int totalNumber){
        return true;
    }
    public void addPerson(Person person){

    }
    public void removePerson(Person person){

    }
}
