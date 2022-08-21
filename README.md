daemon<table><tr><td><b>daemon</b></td><td>name</td></tr>
<tr><td><b>daemon</b></td><td>display-name</td></tr>
<tr><td><b>0</b></td><td>default</td></tr>
<tr><td><b>str</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b></b></td><td>enum-values</td></tr>
<tr><td><b>no</b></td><td>requires-value</td></tr>
<tr><td><b>clx, general-options</b></td><td>tags</td></tr>
<tr><td><b>run as collector as daemon</b></td><td>description</td></tr>
<tr><td><b>The play opens one year after the death of Richard II, and King Henry is making plans for a crusade to the Holy Land to cleanse himself of the guilt he feels over the usurpation of Richard's crown. But the crusade must be postponed when Henry learns that Welsh rebels, led by Owen Glendower, have defeated and captured Mortimer.</b></td><td>help</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
</table>logfile<table><tr><td><b>logfile</b></td><td>name</td></tr>
<tr><td><b>logging filename</b></td><td>display-name</td></tr>
<tr><td><b>null</b></td><td>default</td></tr>
<tr><td><b>str</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b></b></td><td>enum-values</td></tr>
<tr><td><b>yes</b></td><td>requires-value</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
<tr><td><b>clx, general-options</b></td><td>tags</td></tr>
<tr><td><b>logging filename, by default log messages are written to standard output in application mode and to the system log in daemon mode.</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
</table>stats<table><tr><td><b>stats</b></td><td>name</td></tr>
<tr><td><b>stats</b></td><td>display-name</td></tr>
<tr><td><b>15</b></td><td>default</td></tr>
<tr><td><b>int</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b></b></td><td>enum-values</td></tr>
<tr><td><b>yes</b></td><td>requires-value</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
<tr><td><b>clx, general-options</b></td><td>tags</td></tr>
<tr><td><b>period to dump statistics in seconds</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
</table>verbose<table><tr><td><b>verbose</b></td><td>name</td></tr>
<tr><td><b>verbose</b></td><td>display-name</td></tr>
<tr><td><b>6</b></td><td>default</td></tr>
<tr><td><b>int</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b></b></td><td>enum-values</td></tr>
<tr><td><b>yes</b></td><td>requires-value</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
<tr><td><b>clx, general-options</b></td><td>tags</td></tr>
<tr><td><b>level of verbosity no-7</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
</table>idle-time-limit<table><tr><td><b>idle-time-limit</b></td><td>name</td></tr>
<tr><td><b>idle-time-limit</b></td><td>display-name</td></tr>
<tr><td><b>0</b></td><td>default</td></tr>
<tr><td><b>int</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b></b></td><td>enum-values</td></tr>
<tr><td><b>yes</b></td><td>requires-value</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
<tr><td><b>clx, general-options</b></td><td>tags</td></tr>
<tr><td><b>time in seconds to wait for client to connect</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
</table>sync-time-limit<table><tr><td><b>sync-time-limit</b></td><td>name</td></tr>
<tr><td><b>sync-time-limit</b></td><td>display-name</td></tr>
<tr><td><b>0</b></td><td>default</td></tr>
<tr><td><b>int</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b></b></td><td>enum-values</td></tr>
<tr><td><b>yes</b></td><td>requires-value</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
<tr><td><b>clx, general-options</b></td><td>tags</td></tr>
<tr><td><b>maximum time in seconds to sync collected data with aggregator or save to file</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
</table>comm-time-limit<table><tr><td><b>comm-time-limit</b></td><td>name</td></tr>
<tr><td><b>comm-time-limit</b></td><td>display-name</td></tr>
<tr><td><b>0</b></td><td>default</td></tr>
<tr><td><b>int</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b></b></td><td>enum-values</td></tr>
<tr><td><b>yes</b></td><td>requires-value</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
<tr><td><b>clx, general-options</b></td><td>tags</td></tr>
<tr><td><b>maximum time in seconds between communication transactions</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
</table>exit-on-plugin-load-error<table><tr><td><b>exit-on-plugin-load-error</b></td><td>name</td></tr>
<tr><td><b>exit-on-plugin-load-error</b></td><td>display-name</td></tr>
<tr><td><b>false</b></td><td>default</td></tr>
<tr><td><b>bool</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b>true,</b></td><td>enum-values</td></tr>
<tr><td><b>no</b></td><td>requires-value</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
<tr><td><b>clx, counters-selection</b></td><td>tags</td></tr>
<tr><td><b>exit with error if at least loading of one provider was failed</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
</table>enable-provider<table><tr><td><b>enable-provider</b></td><td>name</td></tr>
<tr><td><b>enable-provider</b></td><td>display-name</td></tr>
<tr><td><b></b></td><td>default</td></tr>
<tr><td><b>str</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b></b></td><td>enum-values</td></tr>
<tr><td><b>yes</b></td><td>requires-value</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
<tr><td><b>clx, counters-selection</b></td><td>tags</td></tr>
<tr><td><b>enable pluggable counter provider with the name from being loaded</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
</table>disable-provider<table><tr><td><b>disable-provider</b></td><td>name</td></tr>
<tr><td><b>disable-provider</b></td><td>display-name</td></tr>
<tr><td><b></b></td><td>default</td></tr>
<tr><td><b>str</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b></b></td><td>enum-values</td></tr>
<tr><td><b>yes</b></td><td>requires-value</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
<tr><td><b>clx, counters-selection</b></td><td>tags</td></tr>
<tr><td><b>disable pluggable counter provider with the name from being loaded</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
</table>counter-file<table><tr><td><b>counter-file</b></td><td>name</td></tr>
<tr><td><b>counter-file</b></td><td>display-name</td></tr>
<tr><td><b></b></td><td>default</td></tr>
<tr><td><b>str</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b></b></td><td>enum-values</td></tr>
<tr><td><b>yes</b></td><td>requires-value</td></tr>
<tr><td><b>clx,  counters-selection</b></td><td>tags</td></tr>
<tr><td><b>list of counter names to collect in the form of file; one name per line</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
</table>pedantic<table><tr><td><b>pedantic</b></td><td>name</td></tr>
<tr><td><b>pedantic</b></td><td>display-name</td></tr>
<tr><td><b>false</b></td><td>default</td></tr>
<tr><td><b>bool</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b>true,</b></td><td>enum-values</td></tr>
<tr><td><b>no</b></td><td>requires-value</td></tr>
<tr><td><b>clx,  counters-selection</b></td><td>tags</td></tr>
<tr><td><b>don't ignore errors in counters selection: name pattern mismatch or unavailable counters</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
</table>name-match<table><tr><td><b>name-match</b></td><td>name</td></tr>
<tr><td><b>name-match</b></td><td>display-name</td></tr>
<tr><td><b>1</b></td><td>default</td></tr>
<tr><td><b>str</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b></b></td><td>enum-values</td></tr>
<tr><td><b>yes</b></td><td>requires-value</td></tr>
<tr><td><b>clx,  counters-selection</b></td><td>tags</td></tr>
<tr><td><b>method of counter names matching: exact wildcard or regexp</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
</table>run-over-tcp<table><tr><td><b>run-over-tcp</b></td><td>name</td></tr>
<tr><td><b>tcp</b></td><td>display-name</td></tr>
<tr><td><b>false</b></td><td>default</td></tr>
<tr><td><b>bool</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b>true,</b></td><td>enum-values</td></tr>
<tr><td><b>no</b></td><td>requires-value</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
<tr><td><b>clx, general-options</b></td><td>tags</td></tr>
<tr><td><b>use tcp transport, if not specified - ib will be used.</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
</table>update<table><tr><td><b>update</b></td><td>name</td></tr>
<tr><td><b>update</b></td><td>display-name</td></tr>
<tr><td><b>1000</b></td><td>default</td></tr>
<tr><td><b>int</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b></b></td><td>enum-values</td></tr>
<tr><td><b>yes</b></td><td>requires-value</td></tr>
<tr><td><b>clx,  counters-selection</b></td><td>tags</td></tr>
<tr><td><b>counters update period in milliseconds</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
</table>extra<table><tr><td><b>extra</b></td><td>name</td></tr>
<tr><td><b>extra</b></td><td>display-name</td></tr>
<tr><td><b>val</b></td><td>opt</td></tr>
<tr><td><b>null</b></td><td>default</td></tr>
<tr><td><b>str</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b></b></td><td>enum-values</td></tr>
<tr><td><b>yes</b></td><td>requires-value</td></tr>
<tr><td><b>clx,  counters-selection</b></td><td>tags</td></tr>
<tr><td><b>add custom option to external plugin, use '</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
</table>collect-on-idle<table><tr><td><b>collect-on-idle</b></td><td>name</td></tr>
<tr><td><b>collect-on-idle</b></td><td>display-name</td></tr>
<tr><td><b>false</b></td><td>default</td></tr>
<tr><td><b>bool</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b>true,</b></td><td>enum-values</td></tr>
<tr><td><b>no</b></td><td>requires-value</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
<tr><td><b>clx, general-options</b></td><td>tags</td></tr>
<tr><td><b>indicate collector needs to continue counting while no data consumer connected</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
</table>standalone<table><tr><td><b>standalone</b></td><td>name</td></tr>
<tr><td><b>standalone</b></td><td>display-name</td></tr>
<tr><td><b>false</b></td><td>default</td></tr>
<tr><td><b>bool</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b>true,</b></td><td>enum-values</td></tr>
<tr><td><b>no</b></td><td>requires-value</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
<tr><td><b>clx, general-options</b></td><td>tags</td></tr>
<tr><td><b>run collector in standalone mode. disables agx connection and ipc.</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
</table>spread-workload<table><tr><td><b>spread-workload</b></td><td>name</td></tr>
<tr><td><b>spread-workload</b></td><td>display-name</td></tr>
<tr><td><b>false</b></td><td>default</td></tr>
<tr><td><b>bool</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b></b></td><td>enum-values</td></tr>
<tr><td><b>no</b></td><td>requires-value</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
<tr><td><b>clx, general-options</b></td><td>tags</td></tr>
<tr><td><b>spread collector's workload across available cpus</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
</table>include-names<table><tr><td><b>include-names</b></td><td>name</td></tr>
<tr><td><b>include-names</b></td><td>display-name</td></tr>
<tr><td><b></b></td><td>default</td></tr>
<tr><td><b>str</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b></b></td><td>enum-values</td></tr>
<tr><td><b>yes</b></td><td>requires-value</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
<tr><td><b>clx, counters-selection</b></td><td>tags</td></tr>
<tr><td><b>counter names to include for collecting</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
</table>exclude-names<table><tr><td><b>exclude-names</b></td><td>name</td></tr>
<tr><td><b>exclude-names</b></td><td>display-name</td></tr>
<tr><td><b></b></td><td>default</td></tr>
<tr><td><b>str</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b></b></td><td>enum-values</td></tr>
<tr><td><b>yes</b></td><td>requires-value</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
<tr><td><b>clx, counters-selection</b></td><td>tags</td></tr>
<tr><td><b>counter names to exclude from collection</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
</table>port<table><tr><td><b>port</b></td><td>name</td></tr>
<tr><td><b>port</b></td><td>display-name</td></tr>
<tr><td><b>27500</b></td><td>default</td></tr>
<tr><td><b>int</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b></b></td><td>enum-values</td></tr>
<tr><td><b>yes</b></td><td>requires-value</td></tr>
<tr><td><b>clx, output-options</b></td><td>tags</td></tr>
<tr><td><b>tcp communication port number</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
</table>counter-buffer-size<table><tr><td><b>counter-buffer-size</b></td><td>name</td></tr>
<tr><td><b>counter-buffer-size</b></td><td>display-name</td></tr>
<tr><td><b></b></td><td>default</td></tr>
<tr><td><b>int</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b></b></td><td>enum-values</td></tr>
<tr><td><b>yes</b></td><td>requires-value</td></tr>
<tr><td><b>clx, output-options</b></td><td>tags</td></tr>
<tr><td><b>maximum size of the memory buffer to be used for data exchange in bytes</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
</table>event-buffer-size<table><tr><td><b>event-buffer-size</b></td><td>name</td></tr>
<tr><td><b>event-buffer-size</b></td><td>display-name</td></tr>
<tr><td><b></b></td><td>default</td></tr>
<tr><td><b>int</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b></b></td><td>enum-values</td></tr>
<tr><td><b>yes</b></td><td>requires-value</td></tr>
<tr><td><b>clx, output-options</b></td><td>tags</td></tr>
<tr><td><b>maximum size of the memory buffer to be used for data exchange in bytes</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
</table>output<table><tr><td><b>output</b></td><td>name</td></tr>
<tr><td><b>output</b></td><td>display-name</td></tr>
<tr><td><b>null</b></td><td>default</td></tr>
<tr><td><b>str</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b></b></td><td>enum-values</td></tr>
<tr><td><b>yes</b></td><td>requires-value</td></tr>
<tr><td><b>clx, output-options</b></td><td>tags</td></tr>
<tr><td><b>directory path to write collected data. by default clx writes no data. directory must exist.</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
</table>schema-path<table><tr><td><b>schema-path</b></td><td>name</td></tr>
<tr><td><b>schema-path</b></td><td>display-name</td></tr>
<tr><td><b>null</b></td><td>default</td></tr>
<tr><td><b>str</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b></b></td><td>enum-values</td></tr>
<tr><td><b>yes</b></td><td>requires-value</td></tr>
<tr><td><b>clx, output-options</b></td><td>tags</td></tr>
<tr><td><b>directory name to store schema. ignored if data path is set.</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
</table>data-template<table><tr><td><b>data-template</b></td><td>name</td></tr>
<tr><td><b>data-template</b></td><td>display-name</td></tr>
<tr><td><b>null</b></td><td>default</td></tr>
<tr><td><b>str</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b></b></td><td>enum-values</td></tr>
<tr><td><b>yes</b></td><td>requires-value</td></tr>
<tr><td><b>clx, output-options</b></td><td>tags</td></tr>
<tr><td><b>data directory template</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
</table>data-events-template<table><tr><td><b>data-events-template</b></td><td>name</td></tr>
<tr><td><b>data-events-template</b></td><td>display-name</td></tr>
<tr><td><b></b></td><td>default</td></tr>
<tr><td><b>str</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b></b></td><td>enum-values</td></tr>
<tr><td><b>yes</b></td><td>requires-value</td></tr>
<tr><td><b>clx, output-options</b></td><td>tags</td></tr>
<tr><td><b>event directory template</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
</table>data-file-size-limit<table><tr><td><b>data-file-size-limit</b></td><td>name</td></tr>
<tr><td><b>data-file-size-limit</b></td><td>display-name</td></tr>
<tr><td><b>128</b></td><td>default</td></tr>
<tr><td><b>int</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b></b></td><td>enum-values</td></tr>
<tr><td><b>yes</b></td><td>requires-value</td></tr>
<tr><td><b>clx, output-options</b></td><td>tags</td></tr>
<tr><td><b>maximum size of data file to be stored in megabytes</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
</table>data-file-time-limit<table><tr><td><b>data-file-time-limit</b></td><td>name</td></tr>
<tr><td><b>data-file-time-limit</b></td><td>display-name</td></tr>
<tr><td><b>1800</b></td><td>default</td></tr>
<tr><td><b>int</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b></b></td><td>enum-values</td></tr>
<tr><td><b>yes</b></td><td>requires-value</td></tr>
<tr><td><b>clx, output-options</b></td><td>tags</td></tr>
<tr><td><b>maximum time to use single data file in seconds</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
</table>sr-connect-dev<table><tr><td><b>sr-connect-dev</b></td><td>name</td></tr>
<tr><td><b>sr-connect-dev</b></td><td>display-name</td></tr>
<tr><td><b>null</b></td><td>default</td></tr>
<tr><td><b>str</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b></b></td><td>enum-values</td></tr>
<tr><td><b>yes</b></td><td>requires-value</td></tr>
<tr><td><b>clx, output-options</b></td><td>tags</td></tr>
<tr><td><b>specify device to connect to agx over service record</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
</table>sr-suffix<table><tr><td><b>sr-suffix</b></td><td>name</td></tr>
<tr><td><b>sr-suffix</b></td><td>display-name</td></tr>
<tr><td><b>null</b></td><td>default</td></tr>
<tr><td><b>str</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b></b></td><td>enum-values</td></tr>
<tr><td><b>yes</b></td><td>requires-value</td></tr>
<tr><td><b>clx, output-options</b></td><td>tags</td></tr>
<tr><td><b>suffix to connect via service record</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
</table>runtime-configuration-folder<table><tr><td><b>runtime-configuration-folder</b></td><td>name</td></tr>
<tr><td><b>runtime-configuration-folder</b></td><td>display-name</td></tr>
<tr><td><b>null</b></td><td>default</td></tr>
<tr><td><b>str</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b></b></td><td>enum-values</td></tr>
<tr><td><b>yes</b></td><td>requires-value</td></tr>
<tr><td><b>clx, output-options</b></td><td>tags</td></tr>
<tr><td><b>folder for storage runtime configuration</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
</table>influx<table><tr><td><b>influx</b></td><td>name</td></tr>
<tr><td><b>influx</b></td><td>display-name</td></tr>
<tr><td><b>null</b></td><td>default</td></tr>
<tr><td><b>str</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b></b></td><td>enum-values</td></tr>
<tr><td><b>yes</b></td><td>requires-value</td></tr>
<tr><td><b>clx, output-options</b></td><td>tags</td></tr>
<tr><td><b>uri of the influxdb http api end point to export data</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
</table>influx-key<table><tr><td><b>influx-key</b></td><td>name</td></tr>
<tr><td><b>influx-key</b></td><td>display-name</td></tr>
<tr><td><b>null</b></td><td>default</td></tr>
<tr><td><b>str</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b></b></td><td>enum-values</td></tr>
<tr><td><b>yes</b></td><td>requires-value</td></tr>
<tr><td><b>clx, output-options</b></td><td>tags</td></tr>
<tr><td><b>influxdb api bearer authentification key</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
</table>influx-db<table><tr><td><b>influx-db</b></td><td>name</td></tr>
<tr><td><b>influx-db</b></td><td>display-name</td></tr>
<tr><td><b>collectx</b></td><td>default</td></tr>
<tr><td><b>str</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b></b></td><td>enum-values</td></tr>
<tr><td><b>yes</b></td><td>requires-value</td></tr>
<tr><td><b>clx, output-options</b></td><td>tags</td></tr>
<tr><td><b>influxdb database name</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
</table>influx-bulk<table><tr><td><b>influx-bulk</b></td><td>name</td></tr>
<tr><td><b>influx-bulk</b></td><td>display-name</td></tr>
<tr><td><b>300</b></td><td>default</td></tr>
<tr><td><b>int</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b></b></td><td>enum-values</td></tr>
<tr><td><b>yes</b></td><td>requires-value</td></tr>
<tr><td><b>clx, output-options</b></td><td>tags</td></tr>
<tr><td><b>size of influxdb exporter buffer</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
</table>influx-min-reconnect<table><tr><td><b>influx-min-reconnect</b></td><td>name</td></tr>
<tr><td><b>influx-min-reconnect</b></td><td>display-name</td></tr>
<tr><td><b>10</b></td><td>default</td></tr>
<tr><td><b>int</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b></b></td><td>enum-values</td></tr>
<tr><td><b>yes</b></td><td>requires-value</td></tr>
<tr><td><b>clx, output-options</b></td><td>tags</td></tr>
<tr><td><b>minimim reconnection time in seconds of influxdb exporter</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
</table>influx-max-reconnect<table><tr><td><b>influx-max-reconnect</b></td><td>name</td></tr>
<tr><td><b>influx-max-reconnect</b></td><td>display-name</td></tr>
<tr><td><b>600</b></td><td>default</td></tr>
<tr><td><b>int</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b></b></td><td>enum-values</td></tr>
<tr><td><b>yes</b></td><td>requires-value</td></tr>
<tr><td><b>clx, output-options</b></td><td>tags</td></tr>
<tr><td><b>maximum reconnection time in seconds of influxdb exporter</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
</table>fluentbit-config-dir<table><tr><td><b>fluentbit-config-dir</b></td><td>name</td></tr>
<tr><td><b>fluentbit-config-dir</b></td><td>display-name</td></tr>
<tr><td><b></b></td><td>default</td></tr>
<tr><td><b>str</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b></b></td><td>enum-values</td></tr>
<tr><td><b>yes</b></td><td>requires-value</td></tr>
<tr><td><b>clx, output-options</b></td><td>tags</td></tr>
<tr><td><b>path to folder which contains exp-files</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
</table>prometheus<table><tr><td><b>prometheus</b></td><td>name</td></tr>
<tr><td><b>prometheus</b></td><td>display-name</td></tr>
<tr><td><b>null</b></td><td>default</td></tr>
<tr><td><b>str</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b></b></td><td>enum-values</td></tr>
<tr><td><b>yes</b></td><td>requires-value</td></tr>
<tr><td><b>clx, output-options</b></td><td>tags</td></tr>
<tr><td><b>endpoint for prometheus http server</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
</table>prometheus-fset-dir<table><tr><td><b>prometheus-fset-dir</b></td><td>name</td></tr>
<tr><td><b>prometheus-fset-dir</b></td><td>display-name</td></tr>
<tr><td><b>null</b></td><td>default</td></tr>
<tr><td><b>str</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b></b></td><td>enum-values</td></tr>
<tr><td><b>yes</b></td><td>requires-value</td></tr>
<tr><td><b>clx, output-options</b></td><td>tags</td></tr>
<tr><td><b>path to folder with field set files for prometheus exporting</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
</table>prometheus-cset-dir<table><tr><td><b>prometheus-cset-dir</b></td><td>name</td></tr>
<tr><td><b>prometheus-cset-dir</b></td><td>display-name</td></tr>
<tr><td><b>null</b></td><td>default</td></tr>
<tr><td><b>str</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b></b></td><td>enum-values</td></tr>
<tr><td><b>yes</b></td><td>requires-value</td></tr>
<tr><td><b>clx, output-options</b></td><td>tags</td></tr>
<tr><td><b>path to folder with counter set files for prometheus exporting</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
</table>prometheus-indexes<table><tr><td><b>prometheus-indexes</b></td><td>name</td></tr>
<tr><td><b>prometheus-indexes</b></td><td>display-name</td></tr>
<tr><td><b>null</b></td><td>default</td></tr>
<tr><td><b>str</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b></b></td><td>enum-values</td></tr>
<tr><td><b>yes</b></td><td>requires-value</td></tr>
<tr><td><b>clx, output-options</b></td><td>tags</td></tr>
<tr><td><b>comma-separated counterset description for prometheus indexing</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
</table>prometheus-fset-indexes<table><tr><td><b>prometheus-fset-indexes</b></td><td>name</td></tr>
<tr><td><b>prometheus-fset-indexes</b></td><td>display-name</td></tr>
<tr><td><b>null</b></td><td>default</td></tr>
<tr><td><b>str</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b></b></td><td>enum-values</td></tr>
<tr><td><b>yes</b></td><td>requires-value</td></tr>
<tr><td><b>clx, output-options</b></td><td>tags</td></tr>
<tr><td><b>comma-separated fieldset description for prometheus indexing</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
</table>prometheus-fset-indexes-file<table><tr><td><b>prometheus-fset-indexes-file</b></td><td>name</td></tr>
<tr><td><b>prometheus-fset-indexes-file</b></td><td>display-name</td></tr>
<tr><td><b>null</b></td><td>default</td></tr>
<tr><td><b>str</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b></b></td><td>enum-values</td></tr>
<tr><td><b>yes</b></td><td>requires-value</td></tr>
<tr><td><b>clx, output-options</b></td><td>tags</td></tr>
<tr><td><b>file with fieldset description for prometheus indexing</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
</table>metadata-file<table><tr><td><b>metadata-file</b></td><td>name</td></tr>
<tr><td><b>metadata-file</b></td><td>display-name</td></tr>
<tr><td><b>null</b></td><td>default</td></tr>
<tr><td><b>str</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b></b></td><td>enum-values</td></tr>
<tr><td><b></b></td><td>requires-value</td></tr>
<tr><td><b>clx, output-options</b></td><td>tags</td></tr>
<tr><td><b>path to file with hosts metadata</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
</table>prometheus-cert<table><tr><td><b>prometheus-cert</b></td><td>name</td></tr>
<tr><td><b>prometheus-cert</b></td><td>display-name</td></tr>
<tr><td><b>null</b></td><td>default</td></tr>
<tr><td><b>str</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b></b></td><td>enum-values</td></tr>
<tr><td><b>yes</b></td><td>requires-value</td></tr>
<tr><td><b>clx, output-options</b></td><td>tags</td></tr>
<tr><td><b>path to certificate file for prometheus https endpoint</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
</table>prometheus-key<table><tr><td><b>prometheus-key</b></td><td>name</td></tr>
<tr><td><b>prometheus-key</b></td><td>display-name</td></tr>
<tr><td><b>null</b></td><td>default</td></tr>
<tr><td><b>str</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b></b></td><td>enum-values</td></tr>
<tr><td><b>yes</b></td><td>requires-value</td></tr>
<tr><td><b>clx, output-options</b></td><td>tags</td></tr>
<tr><td><b>path to certificate key file for prometheus https endpoint</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
</table>prometheus-ignore-names<table><tr><td><b>prometheus-ignore-names</b></td><td>name</td></tr>
<tr><td><b>prometheus-ignore-names</b></td><td>display-name</td></tr>
<tr><td><b></b></td><td>default</td></tr>
<tr><td><b>str</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b></b></td><td>enum-values</td></tr>
<tr><td><b>yes</b></td><td>requires-value</td></tr>
<tr><td><b>clx, output-options</b></td><td>tags</td></tr>
<tr><td><b>comma-separated list of counter names to be ignored by prometheus exporter</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
</table>prometheus-ignore-tagss<table><tr><td><b>prometheus-ignore-tagss</b></td><td>name</td></tr>
<tr><td><b>prometheus-ignore-tagss</b></td><td>display-name</td></tr>
<tr><td><b></b></td><td>default</td></tr>
<tr><td><b>str</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b></b></td><td>enum-values</td></tr>
<tr><td><b>yes</b></td><td>requires-value</td></tr>
<tr><td><b>clx, output-options</b></td><td>tags</td></tr>
<tr><td><b>comma-separated list of data source tagss names to be ignored by prometheus exporter</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
</table>exporters-dir<table><tr><td><b>exporters-dir</b></td><td>name</td></tr>
<tr><td><b>exporters-dir</b></td><td>display-name</td></tr>
<tr><td><b></b></td><td>default</td></tr>
<tr><td><b>str</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b></b></td><td>enum-values</td></tr>
<tr><td><b>yes</b></td><td>requires-value</td></tr>
<tr><td><b>clx, output-options</b></td><td>tags</td></tr>
<tr><td><b>path to folder where the exporter sos are located</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
</table>exit-after-schema-write<table><tr><td><b>exit-after-schema-write</b></td><td>name</td></tr>
<tr><td><b>exit-after-schema-write</b></td><td>display-name</td></tr>
<tr><td><b>false</b></td><td>default</td></tr>
<tr><td><b>bool</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b></b></td><td>enum-values</td></tr>
<tr><td><b>2</b></td><td>requires-value</td></tr>
<tr><td><b>clx, output-options</b></td><td>tags</td></tr>
<tr><td><b>exit after schema write</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
</table>hcaperf.device-name<table><tr><td><b>hcaperf.device-name</b></td><td>name</td></tr>
<tr><td><b>hcaperf.device-name</b></td><td>display-name</td></tr>
<tr><td><b></b></td><td>default</td></tr>
<tr><td><b>str</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b>init sample ignore</b></td><td>enum-values</td></tr>
<tr><td><b>yes</b></td><td>requires-value</td></tr>
<tr><td><b>counter-provider, hcaperf</b></td><td>tags</td></tr>
<tr><td><b>device name: infiniband device name</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
</table>mlnx.device-name<table><tr><td><b>mlnx.device-name</b></td><td>name</td></tr>
<tr><td><b>mlnx.device-name</b></td><td>display-name</td></tr>
<tr><td><b></b></td><td>default</td></tr>
<tr><td><b>str</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b></b></td><td>enum-values</td></tr>
<tr><td><b>yes</b></td><td>requires-value</td></tr>
<tr><td><b>counter-provider, mlnx-counters</b></td><td>tags</td></tr>
<tr><td><b>device</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
</table>sysfs.component.hca-device<table><tr><td><b>sysfs.component.hca-device</b></td><td>name</td></tr>
<tr><td><b>sysfs.component.hca-device</b></td><td>display-name</td></tr>
<tr><td><b></b></td><td>default</td></tr>
<tr><td><b>str</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b></b></td><td>enum-values</td></tr>
<tr><td><b>yes</b></td><td>requires-value</td></tr>
<tr><td><b>event-provider, sysfs</b></td><td>tags</td></tr>
<tr><td><b>component: ib_port, ib_hw, ib_mr_cache , eth , hwmon</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
</table>dcgm-events-monitor-period<table><tr><td><b>dcgm-events-monitor-period</b></td><td>name</td></tr>
<tr><td><b>dcgm-events-monitor-period</b></td><td>display-name</td></tr>
<tr><td><b>5000000</b></td><td>default</td></tr>
<tr><td><b>int</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b></b></td><td>enum-values</td></tr>
<tr><td><b>yes</b></td><td>requires-value</td></tr>
<tr><td><b>event-provider, dcgm</b></td><td>tags</td></tr>
<tr><td><b>monitor period</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
</table>dcgm-events-profile-period<table><tr><td><b>dcgm-events-profile-period</b></td><td>name</td></tr>
<tr><td><b>dcgm-events-profile-period</b></td><td>display-name</td></tr>
<tr><td><b>1000000</b></td><td>default</td></tr>
<tr><td><b>int</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b></b></td><td>enum-values</td></tr>
<tr><td><b>yes</b></td><td>requires-value</td></tr>
<tr><td><b>event-provider, dcgm</b></td><td>tags</td></tr>
<tr><td><b>profile period</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
</table>dcgm-events-static-period<table><tr><td><b>dcgm-events-static-period</b></td><td>name</td></tr>
<tr><td><b>dcgm-events-static-period</b></td><td>display-name</td></tr>
<tr><td><b>120000000</b></td><td>default</td></tr>
<tr><td><b>int</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b></b></td><td>enum-values</td></tr>
<tr><td><b>yes</b></td><td>requires-value</td></tr>
<tr><td><b>event-provider, dcgm</b></td><td>tags</td></tr>
<tr><td><b>static period</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
</table>dcgm-events-enable-common-fields<table><tr><td><b>dcgm-events-enable-common-fields</b></td><td>name</td></tr>
<tr><td><b>dcgm-events-enable-common-fields</b></td><td>display-name</td></tr>
<tr><td><b>false</b></td><td>default</td></tr>
<tr><td><b>bool</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b>true,</b></td><td>enum-values</td></tr>
<tr><td><b>no</b></td><td>requires-value</td></tr>
<tr><td><b>event-provider, dcgm</b></td><td>tags</td></tr>
<tr><td><b>enable common fields</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
</table>dcgm-events-enable-ecc-fields<table><tr><td><b>dcgm-events-enable-ecc-fields</b></td><td>name</td></tr>
<tr><td><b>dcgm-events-enable-ecc-fields</b></td><td>display-name</td></tr>
<tr><td><b>false</b></td><td>default</td></tr>
<tr><td><b>bool</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b>true,</b></td><td>enum-values</td></tr>
<tr><td><b>no</b></td><td>requires-value</td></tr>
<tr><td><b>event-provider, dcgm</b></td><td>tags</td></tr>
<tr><td><b>enable ecc fields</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
</table>dcgm-events-enable-gpu-fields<table><tr><td><b>dcgm-events-enable-gpu-fields</b></td><td>name</td></tr>
<tr><td><b>dcgm-events-enable-gpu-fields</b></td><td>display-name</td></tr>
<tr><td><b>true</b></td><td>default</td></tr>
<tr><td><b>bool</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b>true,</b></td><td>enum-values</td></tr>
<tr><td><b>no</b></td><td>requires-value</td></tr>
<tr><td><b>event-provider, dcgm</b></td><td>tags</td></tr>
<tr><td><b>enable gpu fields</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
</table>dcgm-events-enable-nvlink-fields<table><tr><td><b>dcgm-events-enable-nvlink-fields</b></td><td>name</td></tr>
<tr><td><b>dcgm-events-enable-nvlink-fields</b></td><td>display-name</td></tr>
<tr><td><b>false</b></td><td>default</td></tr>
<tr><td><b>bool</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b>true,</b></td><td>enum-values</td></tr>
<tr><td><b>no</b></td><td>requires-value</td></tr>
<tr><td><b>event-provider, dcgm</b></td><td>tags</td></tr>
<tr><td><b>enable nvlink fields</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
</table>dcgm-events-enable-nvswitch-fields<table><tr><td><b>dcgm-events-enable-nvswitch-fields</b></td><td>name</td></tr>
<tr><td><b>dcgm-events-enable-nvswitch-fields</b></td><td>display-name</td></tr>
<tr><td><b>false</b></td><td>default</td></tr>
<tr><td><b>bool</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b>true,</b></td><td>enum-values</td></tr>
<tr><td><b>no</b></td><td>requires-value</td></tr>
<tr><td><b>event-provider, dcgm</b></td><td>tags</td></tr>
<tr><td><b>enable nvswitchfields</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
</table>dcgm-events-enable-prof-fields<table><tr><td><b>dcgm-events-enable-prof-fields</b></td><td>name</td></tr>
<tr><td><b>dcgm-events-enable-prof-fields</b></td><td>display-name</td></tr>
<tr><td><b>false</b></td><td>default</td></tr>
<tr><td><b>bool</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b>true,</b></td><td>enum-values</td></tr>
<tr><td><b>no</b></td><td>requires-value</td></tr>
<tr><td><b>event-provider, dcgm</b></td><td>tags</td></tr>
<tr><td><b>enable prof fields</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
</table>dcgm-events-enable-vgpu-fields<table><tr><td><b>dcgm-events-enable-vgpu-fields</b></td><td>name</td></tr>
<tr><td><b>dcgm-events-enable-vgpu-fields</b></td><td>display-name</td></tr>
<tr><td><b>false</b></td><td>default</td></tr>
<tr><td><b>bool</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b>true,</b></td><td>enum-values</td></tr>
<tr><td><b>no</b></td><td>requires-value</td></tr>
<tr><td><b>event-provider, dcgm</b></td><td>tags</td></tr>
<tr><td><b>enable vgpu fields</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
</table>fluent-aggr-port<table><tr><td><b>fluent-aggr-port</b></td><td>name</td></tr>
<tr><td><b>fluent-aggr-port</b></td><td>display-name</td></tr>
<tr><td><b>null</b></td><td>default</td></tr>
<tr><td><b>int</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b></b></td><td>enum-values</td></tr>
<tr><td><b>yes</b></td><td>requires-value</td></tr>
<tr><td><b>event-provider, fluent</b></td><td>tags</td></tr>
<tr><td><b>fluent aggr port</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
</table>ipc-sockets-dir<table><tr><td><b>ipc-sockets-dir</b></td><td>name</td></tr>
<tr><td><b>ipc-sockets-dir</b></td><td>display-name</td></tr>
<tr><td><b>/tmp/ipc_sockets</b></td><td>default</td></tr>
<tr><td><b>str</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b></b></td><td>enum-values</td></tr>
<tr><td><b>yes</b></td><td>requires-value</td></tr>
<tr><td><b>event-provider, fluent</b></td><td>tags</td></tr>
<tr><td><b>sets path to ipc sockets folder</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
</table>nvidia-smi-max-processes<table><tr><td><b>nvidia-smi-max-processes</b></td><td>name</td></tr>
<tr><td><b>nvidia-smi-max-processes</b></td><td>display-name</td></tr>
<tr><td><b>20</b></td><td>default</td></tr>
<tr><td><b>int</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b></b></td><td>enum-values</td></tr>
<tr><td><b>yes</b></td><td>requires-value</td></tr>
<tr><td><b>event-provider, nvidia_smi</b></td><td>tags</td></tr>
<tr><td><b>set max num processes</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
</table>nvidia-smi-xid-logfile<table><tr><td><b>nvidia-smi-xid-logfile</b></td><td>name</td></tr>
<tr><td><b>nvidia-smi-xid-logfile</b></td><td>display-name</td></tr>
<tr><td><b>null</b></td><td>default</td></tr>
<tr><td><b>str</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b></b></td><td>enum-values</td></tr>
<tr><td><b>yes</b></td><td>requires-value</td></tr>
<tr><td><b>event-provider, nvidia_smi</b></td><td>tags</td></tr>
<tr><td><b>nvidia smi provider stat xid log file</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
</table>prometheus-aggr-endpoint.i<table><tr><td><b>prometheus-aggr-endpoint.i</b></td><td>name</td></tr>
<tr><td><b>prometheus-aggr-endpoint.i</b></td><td>display-name</td></tr>
<tr><td><b></b></td><td>default</td></tr>
<tr><td><b>str</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b></b></td><td>enum-values</td></tr>
<tr><td><b>yes</b></td><td>requires-value</td></tr>
<tr><td><b>event-provider, prometheus_aggr_provider</b></td><td>tags</td></tr>
<tr><td><b>i 'runs' from 1 to 65535</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
</table>python-import-app-id<table><tr><td><b>python-import-app-id</b></td><td>name</td></tr>
<tr><td><b>python-import-app-id</b></td><td>display-name</td></tr>
<tr><td><b>00000000-0000-0000-0000-000000000000</b></td><td>default</td></tr>
<tr><td><b>str</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b></b></td><td>enum-values</td></tr>
<tr><td><b>yes</b></td><td>requires-value</td></tr>
<tr><td><b>event-provider, python-provider</b></td><td>tags</td></tr>
<tr><td><b>app id to use for python provider data</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
</table>python-import-num-scripts<table><tr><td><b>python-import-num-scripts</b></td><td>name</td></tr>
<tr><td><b>python-import-num-scripts</b></td><td>display-name</td></tr>
<tr><td><b>1</b></td><td>default</td></tr>
<tr><td><b>int</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b></b></td><td>enum-values</td></tr>
<tr><td><b>yes</b></td><td>requires-value</td></tr>
<tr><td><b>event-provider, python-provider</b></td><td>tags</td></tr>
<tr><td><b>number of scripts used by python provider</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
</table>python-import-config-dir<table><tr><td><b>python-import-config-dir</b></td><td>name</td></tr>
<tr><td><b>python-import-config-dir</b></td><td>display-name</td></tr>
<tr><td><b></b></td><td>default</td></tr>
<tr><td><b>str</b></td><td>type</td></tr>
<tr><td><b></b></td><td>limits</td></tr>
<tr><td><b></b></td><td>enum-values</td></tr>
<tr><td><b>yes</b></td><td>requires-value</td></tr>
<tr><td><b>event-provider, python-provider</b></td><td>tags</td></tr>
<tr><td><b>absolute path of directory with scripts configs</b></td><td>description</td></tr>
<tr><td><b>... ... ...</b></td><td>help</td></tr>
<tr><td><b>visible, rw, basic, expanded</b></td><td>attributes</td></tr>
</table>
