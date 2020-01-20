package com.kodekonveyor.work_request.offer;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import com.kodekonveyor.annotations.TestedBehaviour;
import com.kodekonveyor.annotations.TestedService;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
@RunWith(MockitoJUnitRunner.class)
@TestedBehaviour("Save the new/modified entities")
@TestedService("GiveofferController")
public class GiveofferControllerTest extends GiveofferControllerTestBase {

  @Override
  @BeforeEach
  void setUp() {
    super.setUp();
    giveofferController
        .call(OfferDTOTestData.get());
  }

  @Test
  @DisplayName("The work request with the id is validated")
  public void test1() {
    assertEquals(
        OfferDTOTestData.get().getWorkRequestId(),
        GiveofferControllerTestData.get().getWorkRequestId()
    );

  }

  @Test
  @DisplayName("Price value is returned")
  public void test2() {
    assertEquals(
        OfferDTOTestData.get().getPrice(),
        GiveofferControllerTestData.get().getPrice()
    );
  }

  @Test
  @DisplayName("Price Id value is returned")
  public void test3() {
    assertEquals(
        OfferDTOTestData.get().getId(),
        GiveofferControllerTestData.get().getId()
    );

  }

}
