package lang.object.equals;

import java.util.Objects;

public class UserV2 {
    public UserV2(String id) {
        this.id = id;
    }

    private String id;

    @Override
    public boolean equals(Object o) {
        UserV2 user = (UserV2) o;
        return id.equals(user.id);
    }

}
