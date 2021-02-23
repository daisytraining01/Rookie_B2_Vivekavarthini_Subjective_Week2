$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('com\week2seleindiwrk\Queno1.feature');
formatter.feature({
  "line": 1,
  "name": "Registration",
  "description": "",
  "id": "registration",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Registration into the page",
  "description": "",
  "id": "registration;registration-into-the-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I navigate to the website",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters valid data",
  "rows": [
    {
      "cells": [
        "Fields",
        "Values"
      ],
      "line": 7
    },
    {
      "cells": [
        "FirstName",
        "Viveka"
      ],
      "line": 8
    },
    {
      "cells": [
        "LastName",
        "varthini"
      ],
      "line": 9
    },
    {
      "cells": [
        "phone",
        "8737821982"
      ],
      "line": 10
    },
    {
      "cells": [
        "email",
        "vive99@gmail.com"
      ],
      "line": 11
    },
    {
      "cells": [
        "Address",
        "2,Abc stree"
      ],
      "line": 12
    },
    {
      "cells": [
        "City",
        "cbe"
      ],
      "line": 13
    },
    {
      "cells": [
        "State",
        "Tamil Nadu"
      ],
      "line": 14
    },
    {
      "cells": [
        "pin",
        "580432"
      ],
      "line": 15
    },
    {
      "cells": [
        "country",
        "INDIA"
      ],
      "line": 16
    },
    {
      "cells": [
        "userName",
        "vivekavarthini"
      ],
      "line": 17
    },
    {
      "cells": [
        "password",
        "vive5793"
      ],
      "line": 18
    },
    {
      "cells": [
        "confirmPassword",
        "vive57935"
      ],
      "line": 19
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "Registration should be done",
  "keyword": "Then "
});
formatter.match({
  "location": "Queno1.givenMethod()"
});
formatter.result({
  "duration": 6541782200,
  "status": "passed"
});
formatter.match({
  "location": "Queno1.whenMethod(DataTable)"
});
formatter.result({
  "duration": 3810906800,
  "status": "passed"
});
formatter.match({
  "location": "Queno1.thenMethod()"
});
formatter.result({
  "duration": 1235469900,
  "status": "passed"
});
});