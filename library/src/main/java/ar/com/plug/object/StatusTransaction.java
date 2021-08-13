package ar.com.plug.object;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.Arrays;
import java.util.Objects;

@Getter
@AllArgsConstructor
public enum StatusTransaction {

    ACTIVE(1, "01"),
    INACTIVE(2, "02"),
    PENDING(3, "03");

    private static final long serialVersionUID = 1L;
    private final Integer id;
    private final String code;

    public StatusTransaction fromId(Integer id){
        return Arrays.stream(values()).filter(statusTransaction -> Objects.equals(id, statusTransaction.id)).findAny().orElse(null);
    }

    public StatusTransaction fromCode(String code){
        return Arrays.stream(values()).filter(statusTransaction -> Objects.equals(code, statusTransaction.code)).findAny().orElse(null);
    }
}
