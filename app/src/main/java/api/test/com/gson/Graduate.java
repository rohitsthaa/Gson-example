package api.test.com.gson;

/**
 * Created by rohit on 6/14/16.
 */

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Graduate {

    @SerializedName("Faculty")
    @Expose
    private String faculty;
    @SerializedName("Year")
    @Expose
    private Integer year;
    @SerializedName("Class")
    @Expose
    private List<Clas> _class = new ArrayList<Clas>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Graduate() {
    }

    /**
     *
     * @param _class
     * @param year
     * @param faculty
     */
    public Graduate(String faculty, Integer year, List<Clas> _class) {
        this.faculty = faculty;
        this.year = year;
        this._class = _class;
    }

    /**
     *
     * @return
     * The faculty
     */
    public String getFaculty() {
        return faculty;
    }

    /**
     *
     * @param faculty
     * The Faculty
     */
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    /**
     *
     * @return
     * The year
     */
    public Integer getYear() {
        return year;
    }

    /**
     *
     * @param year
     * The Year
     */
    public void setYear(Integer year) {
        this.year = year;
    }

    /**
     *
     * @return
     * The _class
     */
    public List<Clas> getClass_() {
        return _class;
    }

    /**
     *
     * @param _class
     * The Class
     */
    public void setClass_(List<Clas> _class) {
        this._class = _class;
    }

}