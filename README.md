# flutter_cell_info_plugin

This project bases its implementation on https://pub.dev/packages/flutter_cell_info (which is also based on something IDC there's a long chain)

The original implementation in a new Flutter project shell. Must be fully compatible with the previous version.

The example app throws `java.lang.SecurityException: getDataNetworkTypeForSubscriber` unless you give the Phone permission in the settings. For the sake of example, do it in settings manually, but remember to ask for the permission beforehand in a real project.