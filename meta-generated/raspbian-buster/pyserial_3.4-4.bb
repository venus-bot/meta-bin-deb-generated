PACKAGES = "${PN} python-serial"
PROVIDES = "python-serial"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/p/pyserial/python-serial_3.4-4_all.deb;unpack=0;name=deb0\
"
DEBFILENAME_python-serial = "python-serial_3.4-4_all.deb"
SRC_URI[deb0.sha256sum] = "245687292be25b4d71f14ee1e104d11e3e2f25909d3a779729dd9df7e3875135"
SRC_URI[deb0.md5sum] = "da768b401bbb3b585c786283fe4007c7"

RDEPENDS_python-serial = "python (<< 2.8) python (>= 2.7.5-5~)"
DEPENDS = "python"


inherit deb_group

FILES_python-serial = " \
    ./usr/lib/python2.7/dist-packages/pyserial-3.4.egg-info/PKG-INFO \
    ./usr/lib/python2.7/dist-packages/pyserial-3.4.egg-info/dependency_links.txt \
    ./usr/lib/python2.7/dist-packages/pyserial-3.4.egg-info/top_level.txt \
    ./usr/lib/python2.7/dist-packages/serial/__init__.py \
    ./usr/lib/python2.7/dist-packages/serial/rfc2217.py \
    ./usr/lib/python2.7/dist-packages/serial/rs485.py \
    ./usr/lib/python2.7/dist-packages/serial/serialcli.py \
    ./usr/lib/python2.7/dist-packages/serial/serialjava.py \
    ./usr/lib/python2.7/dist-packages/serial/serialposix.py \
    ./usr/lib/python2.7/dist-packages/serial/serialutil.py \
    ./usr/lib/python2.7/dist-packages/serial/serialwin32.py \
    ./usr/lib/python2.7/dist-packages/serial/threaded/__init__.py \
    ./usr/lib/python2.7/dist-packages/serial/tools/__init__.py \
    ./usr/lib/python2.7/dist-packages/serial/tools/hexlify_codec.py \
    ./usr/lib/python2.7/dist-packages/serial/tools/list_ports.py \
    ./usr/lib/python2.7/dist-packages/serial/tools/list_ports_common.py \
    ./usr/lib/python2.7/dist-packages/serial/tools/list_ports_linux.py \
    ./usr/lib/python2.7/dist-packages/serial/tools/list_ports_osx.py \
    ./usr/lib/python2.7/dist-packages/serial/tools/list_ports_posix.py \
    ./usr/lib/python2.7/dist-packages/serial/tools/list_ports_windows.py \
    ./usr/lib/python2.7/dist-packages/serial/tools/miniterm.py \
    ./usr/lib/python2.7/dist-packages/serial/urlhandler/__init__.py \
    ./usr/lib/python2.7/dist-packages/serial/urlhandler/protocol_alt.py \
    ./usr/lib/python2.7/dist-packages/serial/urlhandler/protocol_hwgrep.py \
    ./usr/lib/python2.7/dist-packages/serial/urlhandler/protocol_loop.py \
    ./usr/lib/python2.7/dist-packages/serial/urlhandler/protocol_rfc2217.py \
    ./usr/lib/python2.7/dist-packages/serial/urlhandler/protocol_serve-rfc2217.py \
    ./usr/lib/python2.7/dist-packages/serial/urlhandler/protocol_socket.py \
    ./usr/lib/python2.7/dist-packages/serial/urlhandler/protocol_spy.py \
    ./usr/lib/python2.7/dist-packages/serial/win32.py \
    ./usr/share/doc/python-serial/README.rst \
    ./usr/share/doc/python-serial/changelog.Debian.gz \
    ./usr/share/doc/python-serial/changelog.gz \
    ./usr/share/doc/python-serial/copyright \
    ./usr/share/doc/python-serial/examples/at_protocol.py \
    ./usr/share/doc/python-serial/examples/port_publisher.py \
    ./usr/share/doc/python-serial/examples/port_publisher.sh \
    ./usr/share/doc/python-serial/examples/rfc2217_server.py \
    ./usr/share/doc/python-serial/examples/setup-miniterm-py2exe.py \
    ./usr/share/doc/python-serial/examples/setup-rfc2217_server-py2exe.py \
    ./usr/share/doc/python-serial/examples/setup-wxTerminal-py2exe.py \
    ./usr/share/doc/python-serial/examples/tcp_serial_redirect.py \
    ./usr/share/doc/python-serial/examples/wxSerialConfigDialog.py \
    ./usr/share/doc/python-serial/examples/wxSerialConfigDialog.wxg \
    ./usr/share/doc/python-serial/examples/wxTerminal.py \
    ./usr/share/doc/python-serial/examples/wxTerminal.wxg\
"
