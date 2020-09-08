PACKAGES = "${PN} libattr1"
PROVIDES = "libattr1"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/a/attr/libattr1_2.4.47-2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libattr1 = "libattr1_2.4.47-2_armhf.deb"
SRC_URI[deb0.sha256sum] = "34761c1df4f6f9ffe823cccb412ec11bd6b7906565ab2a9abad024d3efee1e19"
SRC_URI[deb0.md5sum] = "b11ba3dbc8d2654bebd8351622fc4390"

RDEPENDS_lib${PN}1 = "libc6 (>= 2.4) multiarch-support"
DEPENDS = "libc6 multiarch-support"


inherit deb_group

FILES_libattr1 = " \
    ./lib/arm-linux-gnueabihf/libattr.so.1 \
    ./lib/arm-linux-gnueabihf/libattr.so.1.1.0 \
    ./usr/share/doc/libattr1/changelog.Debian.gz \
    ./usr/share/doc/libattr1/changelog.gz \
    ./usr/share/doc/libattr1/copyright\
"
