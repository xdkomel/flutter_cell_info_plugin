import 'dart:async';

import 'package:flutter/services.dart';

/// A class that provides information about the cell.
class CellInfo {
  /// Returns a JSON string containing information about the cell.
  static const MethodChannel _channel = const MethodChannel(
    'com.xdkomel.flutter_cell_info_plugin/method_channel',
  );

  /// Returns a JSON string containing information about the cell.
  static Future<String?> get getCellInfo async {
    final String? version = await _channel.invokeMethod('cell_info');
    return version;
  }

  /// Returns a JSON string containing information about the SIM card.
  static Future<String?> get getSIMInfo async {
    final String? version = await _channel.invokeMethod('sim_info');
    return version;
  }

  /// Returns a JSON string containing information about the shared preference.
  static Future<String?> get sharedPreference async {
    final String? version = await _channel.invokeMethod('shared_preference');
    return version;
  }
}
