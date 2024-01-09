import 'package:flutter/material.dart';
import 'package:app_settings/app_settings.dart';

class DisplaySettingsScreen extends StatelessWidget {
  const DisplaySettingsScreen({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Display Settings'),
      ),
      body: PopScope(
        child: Center(
          child: ElevatedButton(
            onPressed: () => AppSettings.openAppSettingsPanel(AppSettingsPanelType.display),
            child: const Text('Open Display Settings'),
          ),
        ),
      ),
    );
  }
}
