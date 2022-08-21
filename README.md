# CollectX - Fabric Monitoring Framework

Data Collection - counters from:
* Node CPU/memory
* HCA - sysfs-based
* HCA - Performance Metrics 
* HCA - Transport-Specific Metrics

Job Scheduler Integration
* PBS
* Slurm

Data Extraction
* Counters selection on per-job basis
* Counters export to time-series database (Influx, ElasticSearch)
* Plot generation
* Custom reports using user-defined scripts

Management
* Centralized Command-Line Interface 
* Web-based back-end for automation

## CollectX documentation

Detailed [CollectX documentation](doc).

## Build CollectX

CollectX projects is shipped as bundle of two RPM packages: Collector and Aggregation Server.
OS release of the build host must match target OS release (SLES, RHEL etc.)

Build collector binaries package.

```bash
git clone --recurse-submodules git@github.com:Mellanox/Collectx.git
./Collectx/contrib/build_clx.sh
```

Build aggregation server package (may run in parallel with collector build).

```bash
./Collectx/contrib/build_agx.sh
```

For development build and extra build options [see detailed documentation](doc/build/build.md).

## Deploy CollectX on Jazz Cluster 

This info is for reference, please do not do this under normal circumstances.

Install Collector RPM on every compute node from which data is to be collected.
Target OS must match that the package was built on (SLES, RHEL etc.)

```bash
./Collectx/contrib/update_clx.sh jazz[01-32]
```

Install Collector and Aggregation server RPMs on nodes dedicated for aggregation server.

```bash
./Collectx/contrib/update_agx.sh agx-[1-3]
```

Installation prefix of the packages is `/opt/mellanox/collectx`.
Log files will be written to the `/var/log/agx` and `/var/log/clx` directories.

## Run CollectX

When installed as RPM, the default is for the Collector to run out of the box.
Aggregation server needs to be configured to work properly. To do this, update the `agx` section of the
configuration file `/opt/mellanox/collectx/etc/collectx.ini` on each aggregation node.

```ini
[agx]
; Root of data storage. Required to store aggregated data.
data_root=/clx_data
```

To monitor the cluster, update the `agx_manager` section of the configuration file `/opt/mellanox/collectx/etc/collectx.ini` on the aggregation server node.  If more than one aggregation server node is installed, then this needs to be done for the one
chosen as the master.

```ini
[agx_manager]
; Number of nodes to be served by single aggregator
nodes_per_aggregator=16
; Number of aggregators to run on each aggregation server node
aggregators_per_server=8
; Compressed list of aggregation server nodes
aggregation_servers=localhost
; Compressed list of nodes to aggregate data from.
include_nodes=boo[21-24]
```

For configuration options [see detailed documentation](doc/configure/readme.md).


[comment]: <> (This is a comment, it will not be included)
## CollectX options
<h3>daemon</h3><table><tr><td><b>name</b></td><td>daemon</td></tr>
<tr><td><b>display-name</b></td><td>daemon</td></tr>
<tr><td><b>default</b></td><td>0</td></tr>
<tr><td><b>type</b></td><td>str</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">run as collector as daemon</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">The play opens one year after the death of Richard II, and King Henry is making plans for a crusade to the Holy Land to cleanse himself of the guilt he feels over the usurpation of Richard's crown. But the crusade must be postponed when Henry learns that Welsh rebels, led by Owen Glendower, have defeated and captured Mortimer.</td></tr>
</table><h3>logfile</h3><table><tr><td><b>name</b></td><td>logfile</td></tr>
<tr><td><b>display-name</b></td><td>logging filename</td></tr>
<tr><td><b>default</b></td><td>null</td></tr>
<tr><td><b>type</b></td><td>str</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">logging filename, by default log messages are written to standard output in application mode and to the system log in daemon mode.</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>stats</h3><table><tr><td><b>name</b></td><td>stats</td></tr>
<tr><td><b>display-name</b></td><td>stats</td></tr>
<tr><td><b>default</b></td><td>15</td></tr>
<tr><td><b>type</b></td><td>int</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">period to dump statistics in seconds</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>verbose</h3><table><tr><td><b>name</b></td><td>verbose</td></tr>
<tr><td><b>display-name</b></td><td>verbose</td></tr>
<tr><td><b>default</b></td><td>6</td></tr>
<tr><td><b>type</b></td><td>int</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">level of verbosity no-7</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>idle-time-limit</h3><table><tr><td><b>name</b></td><td>idle-time-limit</td></tr>
<tr><td><b>display-name</b></td><td>idle-time-limit</td></tr>
<tr><td><b>default</b></td><td>0</td></tr>
<tr><td><b>type</b></td><td>int</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">time in seconds to wait for client to connect</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>sync-time-limit</h3><table><tr><td><b>name</b></td><td>sync-time-limit</td></tr>
<tr><td><b>display-name</b></td><td>sync-time-limit</td></tr>
<tr><td><b>default</b></td><td>0</td></tr>
<tr><td><b>type</b></td><td>int</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">maximum time in seconds to sync collected data with aggregator or save to file</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>comm-time-limit</h3><table><tr><td><b>name</b></td><td>comm-time-limit</td></tr>
<tr><td><b>display-name</b></td><td>comm-time-limit</td></tr>
<tr><td><b>default</b></td><td>0</td></tr>
<tr><td><b>type</b></td><td>int</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">maximum time in seconds between communication transactions</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>exit-on-plugin-load-error</h3><table><tr><td><b>name</b></td><td>exit-on-plugin-load-error</td></tr>
<tr><td><b>display-name</b></td><td>exit-on-plugin-load-error</td></tr>
<tr><td><b>default</b></td><td>false</td></tr>
<tr><td><b>type</b></td><td>bool</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">exit with error if at least loading of one provider was failed</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>enable-provider</h3><table><tr><td><b>name</b></td><td>enable-provider</td></tr>
<tr><td><b>display-name</b></td><td>enable-provider</td></tr>
<tr><td><b>default</b></td><td></td></tr>
<tr><td><b>type</b></td><td>str</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">enable pluggable counter provider with the name from being loaded</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>disable-provider</h3><table><tr><td><b>name</b></td><td>disable-provider</td></tr>
<tr><td><b>display-name</b></td><td>disable-provider</td></tr>
<tr><td><b>default</b></td><td></td></tr>
<tr><td><b>type</b></td><td>str</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">disable pluggable counter provider with the name from being loaded</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>counter-file</h3><table><tr><td><b>name</b></td><td>counter-file</td></tr>
<tr><td><b>display-name</b></td><td>counter-file</td></tr>
<tr><td><b>default</b></td><td></td></tr>
<tr><td><b>type</b></td><td>str</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">list of counter names to collect in the form of file; one name per line</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>pedantic</h3><table><tr><td><b>name</b></td><td>pedantic</td></tr>
<tr><td><b>display-name</b></td><td>pedantic</td></tr>
<tr><td><b>default</b></td><td>false</td></tr>
<tr><td><b>type</b></td><td>bool</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">don't ignore errors in counters selection: name pattern mismatch or unavailable counters</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>name-match</h3><table><tr><td><b>name</b></td><td>name-match</td></tr>
<tr><td><b>display-name</b></td><td>name-match</td></tr>
<tr><td><b>default</b></td><td>1</td></tr>
<tr><td><b>type</b></td><td>str</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">method of counter names matching: exact wildcard or regexp</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>run-over-tcp</h3><table><tr><td><b>name</b></td><td>run-over-tcp</td></tr>
<tr><td><b>display-name</b></td><td>tcp</td></tr>
<tr><td><b>default</b></td><td>false</td></tr>
<tr><td><b>type</b></td><td>bool</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">use tcp transport, if not specified - ib will be used.</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>update</h3><table><tr><td><b>name</b></td><td>update</td></tr>
<tr><td><b>display-name</b></td><td>update</td></tr>
<tr><td><b>default</b></td><td>1000</td></tr>
<tr><td><b>type</b></td><td>int</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">counters update period in milliseconds</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>extra</h3><table><tr><td><b>name</b></td><td>extra</td></tr>
<tr><td><b>display-name</b></td><td>extra</td></tr>
<tr><td><b>default</b></td><td>null</td></tr>
<tr><td><b>type</b></td><td>str</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">add custom option to external plugin, use '</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>collect-on-idle</h3><table><tr><td><b>name</b></td><td>collect-on-idle</td></tr>
<tr><td><b>display-name</b></td><td>collect-on-idle</td></tr>
<tr><td><b>default</b></td><td>false</td></tr>
<tr><td><b>type</b></td><td>bool</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">indicate collector needs to continue counting while no data consumer connected</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>standalone</h3><table><tr><td><b>name</b></td><td>standalone</td></tr>
<tr><td><b>display-name</b></td><td>standalone</td></tr>
<tr><td><b>default</b></td><td>false</td></tr>
<tr><td><b>type</b></td><td>bool</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">run collector in standalone mode. disables agx connection and ipc.</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>spread-workload</h3><table><tr><td><b>name</b></td><td>spread-workload</td></tr>
<tr><td><b>display-name</b></td><td>spread-workload</td></tr>
<tr><td><b>default</b></td><td>false</td></tr>
<tr><td><b>type</b></td><td>bool</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">spread collector's workload across available cpus</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>include-names</h3><table><tr><td><b>name</b></td><td>include-names</td></tr>
<tr><td><b>display-name</b></td><td>include-names</td></tr>
<tr><td><b>default</b></td><td></td></tr>
<tr><td><b>type</b></td><td>str</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">counter names to include for collecting</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>exclude-names</h3><table><tr><td><b>name</b></td><td>exclude-names</td></tr>
<tr><td><b>display-name</b></td><td>exclude-names</td></tr>
<tr><td><b>default</b></td><td></td></tr>
<tr><td><b>type</b></td><td>str</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">counter names to exclude from collection</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>port</h3><table><tr><td><b>name</b></td><td>port</td></tr>
<tr><td><b>display-name</b></td><td>port</td></tr>
<tr><td><b>default</b></td><td>27500</td></tr>
<tr><td><b>type</b></td><td>int</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">tcp communication port number</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>counter-buffer-size</h3><table><tr><td><b>name</b></td><td>counter-buffer-size</td></tr>
<tr><td><b>display-name</b></td><td>counter-buffer-size</td></tr>
<tr><td><b>default</b></td><td></td></tr>
<tr><td><b>type</b></td><td>int</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">maximum size of the memory buffer to be used for data exchange in bytes</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>event-buffer-size</h3><table><tr><td><b>name</b></td><td>event-buffer-size</td></tr>
<tr><td><b>display-name</b></td><td>event-buffer-size</td></tr>
<tr><td><b>default</b></td><td></td></tr>
<tr><td><b>type</b></td><td>int</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">maximum size of the memory buffer to be used for data exchange in bytes</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>output</h3><table><tr><td><b>name</b></td><td>output</td></tr>
<tr><td><b>display-name</b></td><td>output</td></tr>
<tr><td><b>default</b></td><td>null</td></tr>
<tr><td><b>type</b></td><td>str</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">directory path to write collected data. by default clx writes no data. directory must exist.</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>schema-path</h3><table><tr><td><b>name</b></td><td>schema-path</td></tr>
<tr><td><b>display-name</b></td><td>schema-path</td></tr>
<tr><td><b>default</b></td><td>null</td></tr>
<tr><td><b>type</b></td><td>str</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">directory name to store schema. ignored if data path is set.</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>data-template</h3><table><tr><td><b>name</b></td><td>data-template</td></tr>
<tr><td><b>display-name</b></td><td>data-template</td></tr>
<tr><td><b>default</b></td><td>null</td></tr>
<tr><td><b>type</b></td><td>str</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">data directory template</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>data-events-template</h3><table><tr><td><b>name</b></td><td>data-events-template</td></tr>
<tr><td><b>display-name</b></td><td>data-events-template</td></tr>
<tr><td><b>default</b></td><td></td></tr>
<tr><td><b>type</b></td><td>str</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">event directory template</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>data-file-size-limit</h3><table><tr><td><b>name</b></td><td>data-file-size-limit</td></tr>
<tr><td><b>display-name</b></td><td>data-file-size-limit</td></tr>
<tr><td><b>default</b></td><td>128</td></tr>
<tr><td><b>type</b></td><td>int</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">maximum size of data file to be stored in megabytes</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>data-file-time-limit</h3><table><tr><td><b>name</b></td><td>data-file-time-limit</td></tr>
<tr><td><b>display-name</b></td><td>data-file-time-limit</td></tr>
<tr><td><b>default</b></td><td>1800</td></tr>
<tr><td><b>type</b></td><td>int</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">maximum time to use single data file in seconds</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>sr-connect-dev</h3><table><tr><td><b>name</b></td><td>sr-connect-dev</td></tr>
<tr><td><b>display-name</b></td><td>sr-connect-dev</td></tr>
<tr><td><b>default</b></td><td>null</td></tr>
<tr><td><b>type</b></td><td>str</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">specify device to connect to agx over service record</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>sr-suffix</h3><table><tr><td><b>name</b></td><td>sr-suffix</td></tr>
<tr><td><b>display-name</b></td><td>sr-suffix</td></tr>
<tr><td><b>default</b></td><td>null</td></tr>
<tr><td><b>type</b></td><td>str</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">suffix to connect via service record</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>runtime-configuration-folder</h3><table><tr><td><b>name</b></td><td>runtime-configuration-folder</td></tr>
<tr><td><b>display-name</b></td><td>runtime-configuration-folder</td></tr>
<tr><td><b>default</b></td><td>null</td></tr>
<tr><td><b>type</b></td><td>str</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">folder for storage runtime configuration</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>influx</h3><table><tr><td><b>name</b></td><td>influx</td></tr>
<tr><td><b>display-name</b></td><td>influx</td></tr>
<tr><td><b>default</b></td><td>null</td></tr>
<tr><td><b>type</b></td><td>str</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">uri of the influxdb http api end point to export data</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>influx-key</h3><table><tr><td><b>name</b></td><td>influx-key</td></tr>
<tr><td><b>display-name</b></td><td>influx-key</td></tr>
<tr><td><b>default</b></td><td>null</td></tr>
<tr><td><b>type</b></td><td>str</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">influxdb api bearer authentification key</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>influx-db</h3><table><tr><td><b>name</b></td><td>influx-db</td></tr>
<tr><td><b>display-name</b></td><td>influx-db</td></tr>
<tr><td><b>default</b></td><td>collectx</td></tr>
<tr><td><b>type</b></td><td>str</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">influxdb database name</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>influx-bulk</h3><table><tr><td><b>name</b></td><td>influx-bulk</td></tr>
<tr><td><b>display-name</b></td><td>influx-bulk</td></tr>
<tr><td><b>default</b></td><td>300</td></tr>
<tr><td><b>type</b></td><td>int</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">size of influxdb exporter buffer</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>influx-min-reconnect</h3><table><tr><td><b>name</b></td><td>influx-min-reconnect</td></tr>
<tr><td><b>display-name</b></td><td>influx-min-reconnect</td></tr>
<tr><td><b>default</b></td><td>10</td></tr>
<tr><td><b>type</b></td><td>int</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">minimim reconnection time in seconds of influxdb exporter</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>influx-max-reconnect</h3><table><tr><td><b>name</b></td><td>influx-max-reconnect</td></tr>
<tr><td><b>display-name</b></td><td>influx-max-reconnect</td></tr>
<tr><td><b>default</b></td><td>600</td></tr>
<tr><td><b>type</b></td><td>int</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">maximum reconnection time in seconds of influxdb exporter</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>fluentbit-config-dir</h3><table><tr><td><b>name</b></td><td>fluentbit-config-dir</td></tr>
<tr><td><b>display-name</b></td><td>fluentbit-config-dir</td></tr>
<tr><td><b>default</b></td><td></td></tr>
<tr><td><b>type</b></td><td>str</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">path to folder which contains exp-files</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>prometheus</h3><table><tr><td><b>name</b></td><td>prometheus</td></tr>
<tr><td><b>display-name</b></td><td>prometheus</td></tr>
<tr><td><b>default</b></td><td>null</td></tr>
<tr><td><b>type</b></td><td>str</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">endpoint for prometheus http server</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>prometheus-fset-dir</h3><table><tr><td><b>name</b></td><td>prometheus-fset-dir</td></tr>
<tr><td><b>display-name</b></td><td>prometheus-fset-dir</td></tr>
<tr><td><b>default</b></td><td>null</td></tr>
<tr><td><b>type</b></td><td>str</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">path to folder with field set files for prometheus exporting</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>prometheus-cset-dir</h3><table><tr><td><b>name</b></td><td>prometheus-cset-dir</td></tr>
<tr><td><b>display-name</b></td><td>prometheus-cset-dir</td></tr>
<tr><td><b>default</b></td><td>null</td></tr>
<tr><td><b>type</b></td><td>str</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">path to folder with counter set files for prometheus exporting</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>prometheus-indexes</h3><table><tr><td><b>name</b></td><td>prometheus-indexes</td></tr>
<tr><td><b>display-name</b></td><td>prometheus-indexes</td></tr>
<tr><td><b>default</b></td><td>null</td></tr>
<tr><td><b>type</b></td><td>str</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">comma-separated counterset description for prometheus indexing</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>prometheus-fset-indexes</h3><table><tr><td><b>name</b></td><td>prometheus-fset-indexes</td></tr>
<tr><td><b>display-name</b></td><td>prometheus-fset-indexes</td></tr>
<tr><td><b>default</b></td><td>null</td></tr>
<tr><td><b>type</b></td><td>str</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">comma-separated fieldset description for prometheus indexing</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>prometheus-fset-indexes-file</h3><table><tr><td><b>name</b></td><td>prometheus-fset-indexes-file</td></tr>
<tr><td><b>display-name</b></td><td>prometheus-fset-indexes-file</td></tr>
<tr><td><b>default</b></td><td>null</td></tr>
<tr><td><b>type</b></td><td>str</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">file with fieldset description for prometheus indexing</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>metadata-file</h3><table><tr><td><b>name</b></td><td>metadata-file</td></tr>
<tr><td><b>display-name</b></td><td>metadata-file</td></tr>
<tr><td><b>default</b></td><td>null</td></tr>
<tr><td><b>type</b></td><td>str</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">path to file with hosts metadata</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>prometheus-cert</h3><table><tr><td><b>name</b></td><td>prometheus-cert</td></tr>
<tr><td><b>display-name</b></td><td>prometheus-cert</td></tr>
<tr><td><b>default</b></td><td>null</td></tr>
<tr><td><b>type</b></td><td>str</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">path to certificate file for prometheus https endpoint</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>prometheus-key</h3><table><tr><td><b>name</b></td><td>prometheus-key</td></tr>
<tr><td><b>display-name</b></td><td>prometheus-key</td></tr>
<tr><td><b>default</b></td><td>null</td></tr>
<tr><td><b>type</b></td><td>str</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">path to certificate key file for prometheus https endpoint</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>prometheus-ignore-names</h3><table><tr><td><b>name</b></td><td>prometheus-ignore-names</td></tr>
<tr><td><b>display-name</b></td><td>prometheus-ignore-names</td></tr>
<tr><td><b>default</b></td><td></td></tr>
<tr><td><b>type</b></td><td>str</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">comma-separated list of counter names to be ignored by prometheus exporter</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>prometheus-ignore-tagss</h3><table><tr><td><b>name</b></td><td>prometheus-ignore-tagss</td></tr>
<tr><td><b>display-name</b></td><td>prometheus-ignore-tagss</td></tr>
<tr><td><b>default</b></td><td></td></tr>
<tr><td><b>type</b></td><td>str</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">comma-separated list of data source tagss names to be ignored by prometheus exporter</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>exporters-dir</h3><table><tr><td><b>name</b></td><td>exporters-dir</td></tr>
<tr><td><b>display-name</b></td><td>exporters-dir</td></tr>
<tr><td><b>default</b></td><td></td></tr>
<tr><td><b>type</b></td><td>str</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">path to folder where the exporter sos are located</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>exit-after-schema-write</h3><table><tr><td><b>name</b></td><td>exit-after-schema-write</td></tr>
<tr><td><b>display-name</b></td><td>exit-after-schema-write</td></tr>
<tr><td><b>default</b></td><td>false</td></tr>
<tr><td><b>type</b></td><td>bool</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">exit after schema write</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>hcaperf.device-name</h3><table><tr><td><b>name</b></td><td>hcaperf.device-name</td></tr>
<tr><td><b>display-name</b></td><td>hcaperf.device-name</td></tr>
<tr><td><b>default</b></td><td></td></tr>
<tr><td><b>type</b></td><td>str</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">device name: infiniband device name</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>mlnx.device-name</h3><table><tr><td><b>name</b></td><td>mlnx.device-name</td></tr>
<tr><td><b>display-name</b></td><td>mlnx.device-name</td></tr>
<tr><td><b>default</b></td><td></td></tr>
<tr><td><b>type</b></td><td>str</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">device</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>sysfs.component.hca-device</h3><table><tr><td><b>name</b></td><td>sysfs.component.hca-device</td></tr>
<tr><td><b>display-name</b></td><td>sysfs.component.hca-device</td></tr>
<tr><td><b>default</b></td><td></td></tr>
<tr><td><b>type</b></td><td>str</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">component: ib_port, ib_hw, ib_mr_cache , eth , hwmon</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>dcgm-events-monitor-period</h3><table><tr><td><b>name</b></td><td>dcgm-events-monitor-period</td></tr>
<tr><td><b>display-name</b></td><td>dcgm-events-monitor-period</td></tr>
<tr><td><b>default</b></td><td>5000000</td></tr>
<tr><td><b>type</b></td><td>int</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">monitor period</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>dcgm-events-profile-period</h3><table><tr><td><b>name</b></td><td>dcgm-events-profile-period</td></tr>
<tr><td><b>display-name</b></td><td>dcgm-events-profile-period</td></tr>
<tr><td><b>default</b></td><td>1000000</td></tr>
<tr><td><b>type</b></td><td>int</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">profile period</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>dcgm-events-static-period</h3><table><tr><td><b>name</b></td><td>dcgm-events-static-period</td></tr>
<tr><td><b>display-name</b></td><td>dcgm-events-static-period</td></tr>
<tr><td><b>default</b></td><td>120000000</td></tr>
<tr><td><b>type</b></td><td>int</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">static period</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>dcgm-events-enable-common-fields</h3><table><tr><td><b>name</b></td><td>dcgm-events-enable-common-fields</td></tr>
<tr><td><b>display-name</b></td><td>dcgm-events-enable-common-fields</td></tr>
<tr><td><b>default</b></td><td>false</td></tr>
<tr><td><b>type</b></td><td>bool</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">enable common fields</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>dcgm-events-enable-ecc-fields</h3><table><tr><td><b>name</b></td><td>dcgm-events-enable-ecc-fields</td></tr>
<tr><td><b>display-name</b></td><td>dcgm-events-enable-ecc-fields</td></tr>
<tr><td><b>default</b></td><td>false</td></tr>
<tr><td><b>type</b></td><td>bool</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">enable ecc fields</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>dcgm-events-enable-gpu-fields</h3><table><tr><td><b>name</b></td><td>dcgm-events-enable-gpu-fields</td></tr>
<tr><td><b>display-name</b></td><td>dcgm-events-enable-gpu-fields</td></tr>
<tr><td><b>default</b></td><td>true</td></tr>
<tr><td><b>type</b></td><td>bool</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">enable gpu fields</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>dcgm-events-enable-nvlink-fields</h3><table><tr><td><b>name</b></td><td>dcgm-events-enable-nvlink-fields</td></tr>
<tr><td><b>display-name</b></td><td>dcgm-events-enable-nvlink-fields</td></tr>
<tr><td><b>default</b></td><td>false</td></tr>
<tr><td><b>type</b></td><td>bool</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">enable nvlink fields</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>dcgm-events-enable-nvswitch-fields</h3><table><tr><td><b>name</b></td><td>dcgm-events-enable-nvswitch-fields</td></tr>
<tr><td><b>display-name</b></td><td>dcgm-events-enable-nvswitch-fields</td></tr>
<tr><td><b>default</b></td><td>false</td></tr>
<tr><td><b>type</b></td><td>bool</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">enable nvswitchfields</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>dcgm-events-enable-prof-fields</h3><table><tr><td><b>name</b></td><td>dcgm-events-enable-prof-fields</td></tr>
<tr><td><b>display-name</b></td><td>dcgm-events-enable-prof-fields</td></tr>
<tr><td><b>default</b></td><td>false</td></tr>
<tr><td><b>type</b></td><td>bool</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">enable prof fields</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>dcgm-events-enable-vgpu-fields</h3><table><tr><td><b>name</b></td><td>dcgm-events-enable-vgpu-fields</td></tr>
<tr><td><b>display-name</b></td><td>dcgm-events-enable-vgpu-fields</td></tr>
<tr><td><b>default</b></td><td>false</td></tr>
<tr><td><b>type</b></td><td>bool</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">enable vgpu fields</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>fluent-aggr-port</h3><table><tr><td><b>name</b></td><td>fluent-aggr-port</td></tr>
<tr><td><b>display-name</b></td><td>fluent-aggr-port</td></tr>
<tr><td><b>default</b></td><td>null</td></tr>
<tr><td><b>type</b></td><td>int</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">fluent aggr port</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>ipc-sockets-dir</h3><table><tr><td><b>name</b></td><td>ipc-sockets-dir</td></tr>
<tr><td><b>display-name</b></td><td>ipc-sockets-dir</td></tr>
<tr><td><b>default</b></td><td>/tmp/ipc_sockets</td></tr>
<tr><td><b>type</b></td><td>str</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">sets path to ipc sockets folder</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>nvidia-smi-max-processes</h3><table><tr><td><b>name</b></td><td>nvidia-smi-max-processes</td></tr>
<tr><td><b>display-name</b></td><td>nvidia-smi-max-processes</td></tr>
<tr><td><b>default</b></td><td>20</td></tr>
<tr><td><b>type</b></td><td>int</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">set max num processes</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>nvidia-smi-xid-logfile</h3><table><tr><td><b>name</b></td><td>nvidia-smi-xid-logfile</td></tr>
<tr><td><b>display-name</b></td><td>nvidia-smi-xid-logfile</td></tr>
<tr><td><b>default</b></td><td>null</td></tr>
<tr><td><b>type</b></td><td>str</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">nvidia smi provider stat xid log file</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>prometheus-aggr-endpoint.i</h3><table><tr><td><b>name</b></td><td>prometheus-aggr-endpoint.i</td></tr>
<tr><td><b>display-name</b></td><td>prometheus-aggr-endpoint.i</td></tr>
<tr><td><b>default</b></td><td></td></tr>
<tr><td><b>type</b></td><td>str</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">i 'runs' from 1 to 65535</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>python-import-app-id</h3><table><tr><td><b>name</b></td><td>python-import-app-id</td></tr>
<tr><td><b>display-name</b></td><td>python-import-app-id</td></tr>
<tr><td><b>default</b></td><td>00000000-0000-0000-0000-000000000000</td></tr>
<tr><td><b>type</b></td><td>str</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">app id to use for python provider data</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>python-import-num-scripts</h3><table><tr><td><b>name</b></td><td>python-import-num-scripts</td></tr>
<tr><td><b>display-name</b></td><td>python-import-num-scripts</td></tr>
<tr><td><b>default</b></td><td>1</td></tr>
<tr><td><b>type</b></td><td>int</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">number of scripts used by python provider</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table><h3>python-import-config-dir</h3><table><tr><td><b>name</b></td><td>python-import-config-dir</td></tr>
<tr><td><b>display-name</b></td><td>python-import-config-dir</td></tr>
<tr><td><b>default</b></td><td></td></tr>
<tr><td><b>type</b></td><td>str</td></tr>
<tr><td colspan="2"><b>description<b></td></tr>
<tr><td colspan="2">absolute path of directory with scripts configs</td></tr>
<tr><td colspan="2"><b>help<b></td></tr>
<tr><td colspan="2">... ... ...</td></tr>
</table>

## Check CollectX state and data management

  * `/opt/mellanox/collectx/bin/agx_state.sh` to check state of the aggregation server.
  * `/opt/mellanox/collectx/bin/agx_export.sh` export aggregated data to external data storage [Elasticsearch or InfluxDB](doc/export/readme.md)
  * `/opt/mellanox/collectx/bin/clxcli/clxcli.py` interactive shell for working with CollectX data. See details at [command line interface](server/clxcli/README.md).
