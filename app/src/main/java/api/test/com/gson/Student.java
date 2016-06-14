package api.test.com.gson;

/**
 * Created by rohit on 6/14/16.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Student {

    @SerializedName("Graduate")
    @Expose
    private Graduate graduate;

    /**
     * No args constructor for use in serialization
     *
     */
    public Student() {
    }

    /**
     *
     * @param graduate
     */
    public Student(Graduate graduate) {
        this.graduate = graduate;
    }

    /**
     *
     * @return
     * The graduate
     */
    public Graduate getGraduate() {
        return graduate;
    }

    /**
     *
     * @param graduate
     * The Graduate
     */
    public void setGraduate(Graduate graduate) {
        this.graduate = graduate;
    }

}