PACKAGES = "${PN} libbluetooth-dev libbluetooth3"
PROVIDES = "libbluetooth-dev libbluetooth3"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/b/bluez/libbluetooth-dev_5.50-1.2~deb10u1_armhf.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/b/bluez/libbluetooth3_5.50-1.2~deb10u1_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libbluetooth-dev = "libbluetooth-dev_5.50-1.2~deb10u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "91983dd4680fd74a25ce57628458b597f510090e5b3c0ecc3f762f1491bd28ec"
SRC_URI[deb0.md5sum] = "0096ad4721ab56854c5d499c90e23fd9"
DEBFILENAME_libbluetooth3 = "libbluetooth3_5.50-1.2~deb10u1_armhf.deb"
SRC_URI[deb1.sha256sum] = "3aae098658f9e7dc48b6c0c07fa96661b90f734b185f59e28909b09a49d2d5c4"
SRC_URI[deb1.md5sum] = "99fde58730b925f503a85a328092777d"

RDEPENDS_libbluetooth-dev = "libbluetooth3 (= 5.50-1.2~deb10u1) libc6-dev"
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
