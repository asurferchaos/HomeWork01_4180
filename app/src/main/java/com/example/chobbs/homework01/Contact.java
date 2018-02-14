package com.example.chobbs.homework01;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by chobbs on 2/13/2018.
 */

public class Contact implements Parcelable {
    private String firstName,lastName,company,phone,email,
    address,birthday,nickName,fbURL,twrURL,skype,ytChan;

    public Contact(String firstName, String lastName, String company, String phone, String email, String address, String birthday, String nickName, String fbURL, String twrURL, String skype, String ytChan) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.birthday = birthday;
        this.nickName = nickName;
        this.fbURL = fbURL;
        this.twrURL = twrURL;
        this.skype = skype;
        this.ytChan = ytChan;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", company='" + company + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", birthday='" + birthday + '\'' +
                ", nickName='" + nickName + '\'' +
                ", fbURL='" + fbURL + '\'' +
                ", twrURL='" + twrURL + '\'' +
                ", skype='" + skype + '\'' +
                ", ytChan='" + ytChan + '\'' +
                '}';
    }

    protected Contact(Parcel in){
        this.firstName = in.readString();
        this.lastName = in.readString();
        this.company = in.readString();
        this.phone = in.readString();
        this.email = in.readString();
        this.address = in.readString();
        this.birthday = in.readString();
        this.nickName = in.readString();
        this.fbURL = in.readString();
        this.twrURL = in.readString();
        this.skype = in.readString();
        this.ytChan = in.readString();
    }

    public static final Creator<Contact> CREATOR = new Creator<Contact>() {
        @Override
        public Contact createFromParcel(Parcel in) {
            return new Contact(in);
        }

        @Override
        public Contact[] newArray(int size) {
            return new Contact[size];
        }
    };

        @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

        dest.writeString(this.firstName);
        dest.writeString(this.lastName);
        dest.writeString(this.company);
        dest.writeString(this.phone);
        dest.writeString(this.email);
        dest.writeString(this.address);
        dest.writeString(this.birthday);
        dest.writeString(this.nickName);
        dest.writeString(this.fbURL);
        dest.writeString(this.twrURL);
        dest.writeString(this.skype);
        dest.writeString(this.ytChan);
    }
}