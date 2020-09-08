PACKAGES = "${PN} libproxy1"
PROVIDES = "libproxy1"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/libp/libproxy/libproxy1_0.4.11-4+b2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libproxy1 = "libproxy1_0.4.11-4+b2_armhf.deb"
SRC_URI[deb0.sha256sum] = "d1be1897951a21af16d20da3d4031b8db900a96a7137df5c10f928485d23e28f"
SRC_URI[deb0.md5sum] = "b1c9964ac7da9cf0be44a82a66f976da"

RDEPENDS_${PN}1 = "libc6 (>= 2.4) libgcc1 (>= 1:4.4.0) libstdc++6 (>= 4.9) multiarch-support"
DEPENDS = "libc6 libgcc1 libstdc++6 multiarch-support"


inherit deb_group

FILES_libproxy1 = " \
    ./usr/lib/arm-linux-gnueabihf/libproxy.so.1 \
    ./usr/lib/arm-linux-gnueabihf/libproxy.so.1.0.0 \
    ./usr/share/doc/libproxy1/changelog.Debian.armhf.gz \
    ./usr/share/doc/libproxy1/changelog.Debian.gz \
    ./usr/share/doc/libproxy1/changelog.gz \
    ./usr/share/doc/libproxy1/copyright\
"
