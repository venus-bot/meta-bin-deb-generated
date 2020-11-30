PACKAGES = "${PN} libproxy1v5"
PROVIDES = "libproxy1v5"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libp/libproxy/libproxy1v5_0.4.15-5+deb10u1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libproxy1v5 = "libproxy1v5_0.4.15-5+deb10u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "6df0ec524892f3a962e514a1a7ca4d9c2cab71ffc804ac40f95811cbd83bbe50"
SRC_URI[deb0.md5sum] = "7dcd0c02a66a876d67c604970ef7ffb3"

RDEPENDS_${PN}1v5 = "libc6 (>= 2.4) libgcc1 (>= 1:3.5) libstdc++6 (>= 5.2)"
DEPENDS = "libc6 libgcc1 libstdc++6"


inherit deb_group

FILES_libproxy1v5 = " \
    ./usr/lib/arm-linux-gnueabihf/libproxy.so.1 \
    ./usr/lib/arm-linux-gnueabihf/libproxy.so.1.0.0 \
    ./usr/share/doc/libproxy1v5/NEWS.gz \
    ./usr/share/doc/libproxy1v5/changelog.Debian.gz \
    ./usr/share/doc/libproxy1v5/changelog.gz \
    ./usr/share/doc/libproxy1v5/copyright\
"
