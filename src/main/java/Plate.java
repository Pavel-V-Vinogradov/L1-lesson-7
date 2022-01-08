import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Plate {
    private int food;

    /**
     * потребление котом еды из тарелки
     *
     * @param appetite аппетит
     * @return true если еды в тарелке хватило для удовлетворения аппетита кота
     * false - кот к тарелке не прикладывался (аппетит больше чем положено еды в тарелке)
     */
    public boolean decreaseFood(int appetite) {
        if (food - appetite < 0) {
            return false;
        } else {
            food -= appetite;
            return true;
        }
    }

    public void increaseFood(int n) {
        food += n;
    }

    @Override
    public String toString() {
        return "В тарелка еды: " + food;
    }

}
