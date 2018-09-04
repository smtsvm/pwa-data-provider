package smt.svm.pwadataprovider.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin()
@RequestMapping(value = "healthcheck")
public class HealthCheckController {


    @RequestMapping(value = "/runningStatus", method = RequestMethod.GET)
    public ResponseEntity getRunningStatus(){
        return new ResponseEntity<>("System Works", HttpStatus.OK);
    }

}
