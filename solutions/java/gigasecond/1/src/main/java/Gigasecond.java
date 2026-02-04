import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;

public class Gigasecond {

    Duration duration = Duration.ofSeconds(1000_000_000);
    private LocalDateTime finalDate;
    
    public Gigasecond(LocalDate moment) {
        this.finalDate = moment
                .atStartOfDay()
                .plus(this.duration);
    }

    public Gigasecond(LocalDateTime moment) {
        this.finalDate = moment.plus(this.duration);
    }

    public LocalDateTime getDateTime() {
        return finalDate;
    }
}
