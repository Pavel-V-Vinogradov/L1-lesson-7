import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
public class Cat {
    private final String name;
    private int appetite;
    private boolean satiety; // сытость

    public void eat(Plate p) {
        satiety = p.decreaseFood(appetite);
    }

    @Override
    public String toString() {
        return String.format("%s, аппетит - %s, %s ", name, appetite, (satiety ? " сытый" : " голодный"));
    }
}
