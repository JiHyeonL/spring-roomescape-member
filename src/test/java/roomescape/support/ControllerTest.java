package roomescape.support;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import roomescape.application.ReservationService;
import roomescape.application.ReservationTimeService;
import roomescape.application.ThemeService;
import roomescape.controller.api.ReservationController;
import roomescape.controller.api.ReservationTimeController;
import roomescape.controller.api.ThemeController;

@WebMvcTest(controllers = {
        ReservationController.class,
        ReservationTimeController.class,
        ThemeController.class
})
public class ControllerTest {
    @Autowired
    protected MockMvc mockMvc;
    @Autowired
    protected ObjectMapper objectMapper;
    @MockBean
    private ReservationService reservationService;
    @MockBean
    private ReservationTimeService reservationTimeService;
    @MockBean
    private ThemeService themeService;
}
