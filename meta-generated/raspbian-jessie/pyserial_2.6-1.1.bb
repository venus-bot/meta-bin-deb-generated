PACKAGES = "${PN} python-serial"
PROVIDES = "python-serial"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/p/pyserial/python-serial_2.6-1.1_all.deb;unpack=0;name=deb0\
"
DEBFILENAME_python-serial = "python-serial_2.6-1.1_all.deb"
SRC_URI[deb0.sha256sum] = "14ea6ce8010ef53abf5f8267b8f7ebeae93c8039b0d637cb041d11fdae997873"
SRC_URI[deb0.md5sum] = "4d66582159c4cdbdd10acd7e4faaf1ec"

RDEPENDS_python-serial = "python (>= 2.7) python (<< 2.8)"
DEPENDS = "python"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_python-serial = " \
    ./usr/bin/miniterm.py \
    ./usr/lib/python2.7/dist-packages/pyserial-2.6.egg-info \
    ./usr/lib/python2.7/dist-packages/serial/__init__.py \
    ./usr/lib/python2.7/dist-packages/serial/rfc2217.py \
    ./usr/lib/python2.7/dist-packages/serial/serialcli.py \
    ./usr/lib/python2.7/dist-packages/serial/serialjava.py \
    ./usr/lib/python2.7/dist-packages/serial/serialposix.py \
    ./usr/lib/python2.7/dist-packages/serial/serialutil.py \
    ./usr/lib/python2.7/dist-packages/serial/serialwin32.py \
    ./usr/lib/python2.7/dist-packages/serial/sermsdos.py \
    ./usr/lib/python2.7/dist-packages/serial/tools/__init__.py \
    ./usr/lib/python2.7/dist-packages/serial/tools/list_ports.py \
    ./usr/lib/python2.7/dist-packages/serial/tools/list_ports_posix.py \
    ./usr/lib/python2.7/dist-packages/serial/tools/list_ports_windows.py \
    ./usr/lib/python2.7/dist-packages/serial/tools/miniterm.py \
    ./usr/lib/python2.7/dist-packages/serial/urlhandler/__init__.py \
    ./usr/lib/python2.7/dist-packages/serial/urlhandler/protocol_hwgrep.py \
    ./usr/lib/python2.7/dist-packages/serial/urlhandler/protocol_loop.py \
    ./usr/lib/python2.7/dist-packages/serial/urlhandler/protocol_rfc2217.py \
    ./usr/lib/python2.7/dist-packages/serial/urlhandler/protocol_socket.py \
    ./usr/lib/python2.7/dist-packages/serial/win32.py \
    ./usr/share/doc/python-serial/README.txt \
    ./usr/share/doc/python-serial/changelog.Debian.gz \
    ./usr/share/doc/python-serial/changelog.gz \
    ./usr/share/doc/python-serial/copyright \
    ./usr/share/doc/python-serial/examples/enhancedserial.py \
    ./usr/share/doc/python-serial/examples/port_publisher.py \
    ./usr/share/doc/python-serial/examples/port_publisher.sh \
    ./usr/share/doc/python-serial/examples/rfc2217_server.py \
    ./usr/share/doc/python-serial/examples/scan.py \
    ./usr/share/doc/python-serial/examples/scanlinux.py \
    ./usr/share/doc/python-serial/examples/scanwin32.py \
    ./usr/share/doc/python-serial/examples/setup-miniterm-py2exe.py \
    ./usr/share/doc/python-serial/examples/setup-rfc2217_server-py2exe.py \
    ./usr/share/doc/python-serial/examples/setup-wxTerminal-py2exe.py \
    ./usr/share/doc/python-serial/examples/tcp_serial_redirect.py \
    ./usr/share/doc/python-serial/examples/wxSerialConfigDialog.py \
    ./usr/share/doc/python-serial/examples/wxSerialConfigDialog.wxg \
    ./usr/share/doc/python-serial/examples/wxTerminal.py \
    ./usr/share/doc/python-serial/examples/wxTerminal.wxg\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
