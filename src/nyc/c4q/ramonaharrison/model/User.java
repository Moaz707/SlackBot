package nyc.c4q.ramonaharrison.model;

import org.json.simple.JSONObject;

/**
 * Created by Ramona Harrison
 * on 8/26/16
 *
 * A class representing a user.
 * See https://api.slack.com/types/user
 *
 */
public class User {


    private String id;
    private String name;
    private String deleted;
    private String color;
    private String profile;
    private String is_admin;
    private String is_owner;
    private String is_primary_owner;
    private String is_restricted;
    private String is_ultra_restricted;
    private String has_2fa;
    private String two_factor_type;
    private String has_files;

    public User(JSONObject json) {

        if (json.get("id") != null) {
            this.id = (String) json.get("id");
        }

        if (json.get("name") != null) {
            this.name = (String) json.get("name");
        }

        if (json.get("deleted") != null) {
            this.deleted = (String) json.get("deleted");
        }

        if (json.get("color") != null) {
            this.color = (String) json.get("color");
        }

        if (json.get("profile") != null) {
            this.profile = (String) json.get("profile");
        }

        if (json.get("is_admin") != null) {
            this.is_admin = (String) json.get("is_admin");
        }
        if (json.get("is_owner") != null) {
            this.is_owner = (String) json.get("is_owner");
        }

        if (json.get("is_primary_owner") != null) {
            this.is_primary_owner = (String) json.get("is_primary_owner");
        }

        if (json.get("is_restricted") != null) {
            this.is_restricted = (String) json.get("is_restricted");
        }

        if (json.get("is_ultra_restricted") != null) {
            this.is_ultra_restricted = (String) json.get("is_ultra_restricted");
        }

        if (json.get("has_2fa") != null) {
            this.has_2fa = (String) json.get("has_2fa");
        }

        if (json.get("two_factor_type") != null) {
            this.two_factor_type = (String) json.get("two_factor_type");
        }
        if (json.get("has_files") != null) {
            this.has_files = (String) json.get("has_files");
        }

    }


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDeleted() {
        return deleted;
    }

    public String getColor() {
        return color;
    }

    public String getProfile() {
        return profile;
    }

    public String getIs_admin() {
        return is_admin;
    }

    public String getIs_owner() {
        return is_owner;
    }

    public String getIs_primary_owner() {
        return is_primary_owner;
    }

    public String getIs_restricted() {
        return is_restricted;
    }

    public String getIs_ultra_restricted() {
        return is_ultra_restricted;
    }

    public String getHas_2fa() {
        return has_2fa;
    }

    public String getTwo_factor_type() {
        return two_factor_type;
    }

    public String getHas_files() {
        return has_files;
    }
}
