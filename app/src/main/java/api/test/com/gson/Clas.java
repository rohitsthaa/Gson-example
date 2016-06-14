package api.test.com.gson;

/**
 * Created by rohit on 6/14/16.
 */
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Clas {

    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("Roll_No")
    @Expose
    private Integer rollNo;

    /**
     * No args constructor for use in serialization
     *
     */
    public Clas() {
    }

    /**
     *
     * @param rollNo
     * @param name
     */
    public Clas(String name, Integer rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    /**
     *
     * @return
     * The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The Name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     * The rollNo
     */
    public Integer getRollNo() {
        return rollNo;
    }

    /**
     *
     * @param rollNo
     * The Roll_No
     */
    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }



}