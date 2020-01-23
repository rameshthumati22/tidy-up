package com.kodekonveyor.work_request.revoke;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import com.kodekonveyor.annotations.TestedBehaviour;
import com.kodekonveyor.annotations.TestedService;
import com.kodekonveyor.work_request.AddressEntityTestData;
import com.kodekonveyor.work_request.WorkRequestEntityTestData;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
@RunWith(MockitoJUnitRunner.class)
@TestedBehaviour("Data access")
@TestedService("RevokeWorkRequestController")
public class RevokeWorkRequestControllerDataAccessTest
    extends RevokeWorkRequestControllerTestBase {

  @Override
  @BeforeEach
  void setUp() {
    super.setUp();
    revokeWorkRequestController
        .call(WorkRequestEntityTestData.WORK_REQUEST_ID);
  }

  @Test
  @DisplayName("The work request id is returned corectly")
  public void test1() {
    assertEquals(
        WorkRequestEntityTestData.WORK_REQUEST_ID,
        WorkRequestEntityTestData.get().getId()
    );
  }

  @Test
  @DisplayName("The work type is returned corectly")
  public void test2() {
    assertEquals(
        WorkRequestEntityTestData.WORK_TYPE,
        WorkRequestEntityTestData.get().getWorkType()
    );
  }

  @Test
  @DisplayName("The address is returned corectly")
  public void test3() {
    assertEquals(
        AddressEntityTestData.get(),
        WorkRequestEntityTestData.get().getAddress()
    );
  }

  @Test
  @DisplayName("The description is returned corectly")
  public void test4() {
    assertEquals(
        WorkRequestEntityTestData.DESCRIPTION,
        WorkRequestEntityTestData.get().getDescription()
    );
  }

  @Test
  @DisplayName("The city is returned corectly")
  public void test5() {
    assertEquals(
        AddressEntityTestData.CITY,
        WorkRequestEntityTestData.get().getAddress().getCity()
    );
  }

  @Test
  @DisplayName("The country is returned corectly")
  public void test6() {
    assertEquals(
        AddressEntityTestData.COUNTRY,
        WorkRequestEntityTestData.get().getAddress().getCountry()
    );
  }

}
