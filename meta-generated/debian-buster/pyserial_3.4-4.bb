PACKAGES = "${PN} python-serial python3-serial"
PROVIDES = "python-serial python3-serial"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/p/pyserial/python-serial_3.4-4_all.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/p/pyserial/python3-serial_3.4-4_all.deb;unpack=0;name=deb1\
"
DEBFILENAME_python-serial = "python-serial_3.4-4_all.deb"
SRC_URI[deb0.sha256sum] = "245687292be25b4d71f14ee1e104d11e3e2f25909d3a779729dd9df7e3875135"
SRC_URI[deb0.md5sum] = "da768b401bbb3b585c786283fe4007c7"
DEBFILENAME_python3-serial = "python3-serial_3.4-4_all.deb"
SRC_URI[deb1.sha256sum] = "cb9f0ea6828585a5795cc2348596f1ffacbe231f7f9546fb4c5b6e549a4002ca"
SRC_URI[deb1.md5sum] = "6cf9c2d1e56393f47f12e0f34ad0c382"

RDEPENDS_python-serial = "python (<< 2.8) python (>= 2.7.5-5~)"
RDEPENDS_python3-serial = "python3 (>= 3.3.2-2~)"
DEPENDS = "python python3"


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
FILES_python3-serial = " \
    ./usr/bin/miniterm \
    ./usr/lib/python3/dist-packages/pyserial-3.4.egg-info/PKG-INFO \
    ./usr/lib/python3/dist-packages/pyserial-3.4.egg-info/dependency_links.txt \
    ./usr/lib/python3/dist-packages/pyserial-3.4.egg-info/top_level.txt \
    ./usr/lib/python3/dist-packages/serial/__init__.py \
    ./usr/lib/python3/dist-packages/serial/rfc2217.py \
    ./usr/lib/python3/dist-packages/serial/rs485.py \
    ./usr/lib/python3/dist-packages/serial/serialcli.py \
    ./usr/lib/python3/dist-packages/serial/serialjava.py \
    ./usr/lib/python3/dist-packages/serial/serialposix.py \
    ./usr/lib/python3/dist-packages/serial/serialutil.py \
    ./usr/lib/python3/dist-packages/serial/serialwin32.py \
    ./usr/lib/python3/dist-packages/serial/threaded/__init__.py \
    ./usr/lib/python3/dist-packages/serial/tools/__init__.py \
    ./usr/lib/python3/dist-packages/serial/tools/hexlify_codec.py \
    ./usr/lib/python3/dist-packages/serial/tools/list_ports.py \
    ./usr/lib/python3/dist-packages/serial/tools/list_ports_common.py \
    ./usr/lib/python3/dist-packages/serial/tools/list_ports_linux.py \
    ./usr/lib/python3/dist-packages/serial/tools/list_ports_osx.py \
    ./usr/lib/python3/dist-packages/serial/tools/list_ports_posix.py \
    ./usr/lib/python3/dist-packages/serial/tools/list_ports_windows.py \
    ./usr/lib/python3/dist-packages/serial/tools/miniterm.py \
    ./usr/lib/python3/dist-packages/serial/urlhandler/__init__.py \
    ./usr/lib/python3/dist-packages/serial/urlhandler/protocol_alt.py \
    ./usr/lib/python3/dist-packages/serial/urlhandler/protocol_hwgrep.py \
    ./usr/lib/python3/dist-packages/serial/urlhandler/protocol_loop.py \
    ./usr/lib/python3/dist-packages/serial/urlhandler/protocol_rfc2217.py \
    ./usr/lib/python3/dist-packages/serial/urlhandler/protocol_serve-rfc2217.py \
    ./usr/lib/python3/dist-packages/serial/urlhandler/protocol_socket.py \
    ./usr/lib/python3/dist-packages/serial/urlhandler/protocol_spy.py \
    ./usr/lib/python3/dist-packages/serial/win32.py \
    ./usr/share/doc/python3-serial/changelog.Debian.gz \
    ./usr/share/doc/python3-serial/changelog.gz \
    ./usr/share/doc/python3-serial/copyright\
"
