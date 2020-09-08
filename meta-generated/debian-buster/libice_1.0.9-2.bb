PACKAGES = "${PN} libice6"
PROVIDES = "libice6"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/libi/libice/libice6_1.0.9-2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libice6 = "libice6_1.0.9-2_armhf.deb"
SRC_URI[deb0.sha256sum] = "3fe84b211ed805608d3ccbc186a6b942a41f9ddcffd9c696b7af0fdde678013b"
SRC_URI[deb0.md5sum] = "f8034dbe64e3e5d676b31a6ad9b781c7"

RDEPENDS_${PN}6 = "libbsd0 (>= 0.2.0) libc6 (>= 2.11) x11-common"
DEPENDS = "libbsd0 libc6 x11-common"


inherit deb_group

FILES_libice6 = " \
    ./usr/lib/arm-linux-gnueabihf/libICE.so.6 \
    ./usr/lib/arm-linux-gnueabihf/libICE.so.6.3.0 \
    ./usr/share/doc/libice6/changelog.Debian.gz \
    ./usr/share/doc/libice6/changelog.gz \
    ./usr/share/doc/libice6/copyright\
"
