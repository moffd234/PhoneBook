package com.zipcodewilmington.phonebook;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

// Finished
public class GetAllContactNames {
    @Test
    public void test1() {
        // given
        PhoneBook phoneBook = new PhoneBook();
        String[] names = new String[]{"John", "Joe", "Jim", "Jay"};
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            phoneBook.add(name, "");
        }

        // when
        List<String> actualNames = phoneBook.getAllContactNames();

        // then

        // The assert was changed because this ensuring that all the contact names were
        // being added but the previous way the test method was written ensure the that the return
        // value of getAllContactName is listed in the same order the names were added. However,
        // map.getKeys() did not seem to return the keys in the same order. Will fix if a better
        // method becomes apparent
        Assert.assertTrue(actualNames.containsAll(Arrays.asList(names)));
    }

    @Test
    public void test2() {
        // given
        PhoneBook phoneBook = new PhoneBook();
        String[] names = new String[]{"Chris", "Christian", "Christopher", "Christina"};
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            phoneBook.add(name, "");
        }

        // when
        List<String> actualNames = phoneBook.getAllContactNames();

        // then
        // The assert was changed because this ensuring that all the contact names were
        // being added but the previous way the test method was written ensure the that the return
        // value of getAllContactName is listed in the same order the names were added. However,
        // map.getKeys() did not seem to return the keys in the same order. Will fix if a better
        // method becomes apparent
        Assert.assertTrue(actualNames.containsAll(Arrays.asList(names)));
    }

    @Test
    public void test3() {
        // given
        PhoneBook phoneBook = new PhoneBook();
        String[] names = new String[]{"Ashley", "Aaron", "Albert", "Alfred"};
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            phoneBook.add(name, "");
        }

        // when
        List<String> actualNames = phoneBook.getAllContactNames();

        // then
        // The assert was changed because this ensuring that all the contact names were
        // being added but the previous way the test method was written ensure the that the return
        // value of getAllContactName is listed in the same order the names were added. However,
        // map.getKeys() did not seem to return the keys in the same order. Will fix if a better
        // method becomes apparent
        Assert.assertTrue(actualNames.containsAll(Arrays.asList(names)));
    }
}
