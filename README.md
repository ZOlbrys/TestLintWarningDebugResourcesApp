# TestLintWarningDebugResourcesApp

Running `lint` command on master branch produces no warnings/errors.  Master uses AGP 8.2.2.

Switching to `update-to-agp-8.3.0` branch and running `lint` command produces 1 new error and 2 new warnings.  This branch, as the name implies, uses AGP 8.3.0 (currently the beta02 version).

```
Correctness
1 error MissingClass: Missing registered class

Missing registered class
../../src/debug/AndroidManifest.xml:5: Class referenced in the manifest, com.example.testlintwarningdebugresourcesapp.TestBaseActivity, was not found in the project or the libraries
```

The `TestBaseActivity` is a concrete implementation of an abstract `BaseActivity` class.  In order to launch the activity during instruementation testing, we are required to configure the activity in an `AndroidManifest` file.  Since this is only used for testing, the standard way of achieving this goal is to place the `AndroidManifest` file referencing the activity in the `debug` directory.

```
Performance
2 warning UnusedResources: Unused resources

Unused resources
../../src/debug/res/layout/activity_test.xml:2: The resource R.layout.activity_test appears to be unused
../../src/debug/res/layout/fragment_test.xml:2: The resource R.layout.fragment_test appears to be unused
```

The `activity_test` layout file is the one used by `TestBaseActivity`, and is located in the `debug` layout directory.  The same setup is used for the `fragment_test` layout file which is used by the `TestBaseFragment` class.  This class extends an abstract `BaseFragmenet` class.
