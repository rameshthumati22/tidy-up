package com.kodekonveyor.work_request.revoke;

import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.kodekonveyor.authentication.UserTestData;
import com.kodekonveyor.work_request.AddressTestData;
import com.kodekonveyor.work_request.WorkRequestRepository;
import com.kodekonveyor.work_request.WorkRequestTestData;
import com.kodekonveyor.work_request.revoke.RevokeWorkRequestController;

public class RevokeWorkRequestControllerTestBase {

  @InjectMocks
  RevokeWorkRequestController revokeWorkRequestController;
  @Mock
  WorkRequestRepository workRequestRepository;
  WorkRequestTestData workRequestTestData;

  @BeforeEach
  void setUp() {
    final UserTestData userTestData = new UserTestData();
    final AddressTestData addressTestData = new AddressTestData();

    workRequestTestData =
        new WorkRequestTestData(userTestData, addressTestData);
  }

}
