PACKAGES = "${PN} libbluetooth-dev libbluetooth3"
PROVIDES = "libbluetooth-dev libbluetooth3"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/b/bluez/libbluetooth-dev_5.50-1.2~deb10u3_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/b/bluez/libbluetooth3_5.50-1.2~deb10u3_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libbluetooth-dev = "libbluetooth-dev_5.50-1.2~deb10u3_armhf.deb"
SRC_URI[deb0.sha256sum] = "2e2588456100f9206c19047293025dae0d320b2f6196818945e7e69b41e90418"
SRC_URI[deb0.md5sum] = "20439ca406aa80a4c1ae3edf0a1fad2b"
DEBFILENAME_libbluetooth3 = "libbluetooth3_5.50-1.2~deb10u3_armhf.deb"
SRC_URI[deb1.sha256sum] = "12fd8d66c652520bcfa99de03dc3893d9d1e63c5648e35b7d03dde9fccb81cb7"
SRC_URI[deb1.md5sum] = "82aad6d22755c568bdabfd9de1d2a60a"

RDEPENDS_libbluetooth-dev = "libbluetooth3 (= 5.50-1.2~deb10u3) libc6-dev"
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
