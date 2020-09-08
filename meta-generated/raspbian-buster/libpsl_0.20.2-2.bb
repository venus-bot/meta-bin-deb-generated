PACKAGES = "${PN} libpsl5"
PROVIDES = "libpsl5"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libp/libpsl/libpsl5_0.20.2-2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libpsl5 = "libpsl5_0.20.2-2_armhf.deb"
SRC_URI[deb0.sha256sum] = "e4d0c0fc1b232cc3aee36351a474d55e56c45c587edbb4e3b4ce58ef399bdc3e"
SRC_URI[deb0.md5sum] = "59e2e644f2608d02995853164fb9cc10"

RDEPENDS_${PN}5 = "libc6 (>= 2.4) libidn2-0 (>= 0.16) libunistring2 (>= 0.9.7)"
DEPENDS = "libc6 libidn2-0 libunistring2"


inherit deb_group

FILES_libpsl5 = " \
    ./usr/lib/arm-linux-gnueabihf/libpsl.so.5 \
    ./usr/lib/arm-linux-gnueabihf/libpsl.so.5.3.1 \
    ./usr/share/doc/libpsl5/changelog.Debian.gz \
    ./usr/share/doc/libpsl5/changelog.gz \
    ./usr/share/doc/libpsl5/copyright\
"
