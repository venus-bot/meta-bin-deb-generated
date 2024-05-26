PACKAGES = "${PN} libbluetooth-dev libbluetooth3"
PROVIDES = "libbluetooth-dev libbluetooth3"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/b/bluez/libbluetooth-dev_5.50-1.2~deb10u5_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/b/bluez/libbluetooth3_5.50-1.2~deb10u5_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libbluetooth-dev = "libbluetooth-dev_5.50-1.2~deb10u5_armhf.deb"
SRC_URI[deb0.sha256sum] = "3a9a58cbe2667ae1256d90f4c3e353b2e5e380d9aef23ee1e6a97148d7c833e2"
SRC_URI[deb0.md5sum] = "6c0d90216a8570505bea6bd9c5cd7ffe"
DEBFILENAME_libbluetooth3 = "libbluetooth3_5.50-1.2~deb10u5_armhf.deb"
SRC_URI[deb1.sha256sum] = "a3f0960b02f67d0d69277cd0a109f53032f4c9181025c13a2239a2f80854a26b"
SRC_URI[deb1.md5sum] = "38de2ce5ce8b89ee78f9109c69661604"

RDEPENDS_libbluetooth-dev = "libbluetooth3 (= 5.50-1.2~deb10u5) libc6-dev"
RDEPENDS_libbluetooth3 = "libc6 (>= 2.15) libudev1 (>= 183)"
DEPENDS = "libc6 libc6-dev libudev1"


inherit deb_group

FILES_libbluetooth-dev = " \
    ./usr/include/bluetooth/bluetooth.h \
    ./usr/include/bluetooth/bnep.h \
    ./usr/include/bluetooth/cmtp.h \
    ./usr/include/bluetooth/hci.h \
    ./usr/include/bluetooth/hci_lib.h \
    ./usr/include/bluetooth/hidp.h \
    ./usr/include/bluetooth/l2cap.h \
    ./usr/include/bluetooth/rfcomm.h \
    ./usr/include/bluetooth/sco.h \
    ./usr/include/bluetooth/sdp.h \
    ./usr/include/bluetooth/sdp_lib.h \
    ./usr/lib/arm-linux-gnueabihf/bluetooth/plugins/sixaxis.a \
    ./usr/lib/arm-linux-gnueabihf/libbluetooth.a \
    ./usr/lib/arm-linux-gnueabihf/libbluetooth.so \
    ./usr/lib/arm-linux-gnueabihf/pkgconfig/bluez.pc \
    ./usr/share/doc/libbluetooth-dev/NEWS.Debian.gz \
    ./usr/share/doc/libbluetooth-dev/adapter-api.txt.gz \
    ./usr/share/doc/libbluetooth-dev/advertising-api.txt.gz \
    ./usr/share/doc/libbluetooth-dev/agent-api.txt.gz \
    ./usr/share/doc/libbluetooth-dev/assigned-numbers.txt \
    ./usr/share/doc/libbluetooth-dev/battery-api.txt \
    ./usr/share/doc/libbluetooth-dev/btmon.txt \
    ./usr/share/doc/libbluetooth-dev/btsnoop.txt \
    ./usr/share/doc/libbluetooth-dev/changelog.Debian.gz \
    ./usr/share/doc/libbluetooth-dev/changelog.gz \
    ./usr/share/doc/libbluetooth-dev/coding-style.txt.gz \
    ./usr/share/doc/libbluetooth-dev/copyright \
    ./usr/share/doc/libbluetooth-dev/device-api.txt.gz \
    ./usr/share/doc/libbluetooth-dev/gatt-api.txt.gz \
    ./usr/share/doc/libbluetooth-dev/health-api.txt \
    ./usr/share/doc/libbluetooth-dev/input-api.txt \
    ./usr/share/doc/libbluetooth-dev/maintainer-guidelines.txt.gz \
    ./usr/share/doc/libbluetooth-dev/media-api.txt.gz \
    ./usr/share/doc/libbluetooth-dev/mgmt-api.txt.gz \
    ./usr/share/doc/libbluetooth-dev/network-api.txt \
    ./usr/share/doc/libbluetooth-dev/obex-agent-api.txt \
    ./usr/share/doc/libbluetooth-dev/obex-api.txt.gz \
    ./usr/share/doc/libbluetooth-dev/pics-opp.txt.gz \
    ./usr/share/doc/libbluetooth-dev/pixit-opp.txt \
    ./usr/share/doc/libbluetooth-dev/profile-api.txt \
    ./usr/share/doc/libbluetooth-dev/pts-opp.txt \
    ./usr/share/doc/libbluetooth-dev/sap-api.txt \
    ./usr/share/doc/libbluetooth-dev/settings-storage.txt.gz \
    ./usr/share/doc/libbluetooth-dev/supported-features.txt \
    ./usr/share/doc/libbluetooth-dev/test-coverage.txt \
    ./usr/share/doc/libbluetooth-dev/test-runner.txt \
    ./usr/share/doc/libbluetooth-dev/thermometer-api.txt\
"
FILES_libbluetooth3 = " \
    ./usr/lib/arm-linux-gnueabihf/bluetooth/plugins/sixaxis.so \
    ./usr/lib/arm-linux-gnueabihf/libbluetooth.so.3 \
    ./usr/lib/arm-linux-gnueabihf/libbluetooth.so.3.18.16 \
    ./usr/share/doc/libbluetooth3/NEWS.Debian.gz \
    ./usr/share/doc/libbluetooth3/README.Debian.gz \
    ./usr/share/doc/libbluetooth3/changelog.Debian.gz \
    ./usr/share/doc/libbluetooth3/changelog.gz \
    ./usr/share/doc/libbluetooth3/copyright\
"
