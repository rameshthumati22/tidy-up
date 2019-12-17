package com.kodekonveyor.work_request.revoke;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
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
@TestedService("RevokeWorkRequestController")
public class RevokeWorkRequestControllerTest
    extends RevokeWorkRequestControllerTestBase {

  @Test
  @DisplayName("The work request with the given id is deleted")
  public void deleteWorkRequestById() {

    revokeWorkRequestController
        .call(workRequestTestData.WORK_REQUEST_ID.toString());

    Mockito.verify(workRequestRepository)
        .deleteById(workRequestTestData.WORK_REQUEST_ID);

  }

}
