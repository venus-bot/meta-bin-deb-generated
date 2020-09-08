PACKAGES = "${PN} libattr1"
PROVIDES = "libattr1"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/a/attr/libattr1_2.4.48-4_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libattr1 = "libattr1_2.4.48-4_armhf.deb"
SRC_URI[deb0.sha256sum] = "94f60da60398e964c433357618558abca175a8d337295c531ab5c7a0e1d4df0b"
SRC_URI[deb0.md5sum] = "07702589bfd6d7050cedc8ca2cf7453c"

RDEPENDS_lib${PN}1 = "libc6 (>= 2.4)"
DEPENDS = "libc6"


inherit deb_group

FILES_libattr1 = " \
    ./etc/xattr.conf \
    ./usr/lib/arm-linux-gnueabihf/libattr.so.1 \
    ./usr/lib/arm-linux-gnueabihf/libattr.so.1.1.2448 \
    ./usr/share/doc/libattr1/changelog.Debian.gz \
    ./usr/share/doc/libattr1/changelog.gz \
    ./usr/share/doc/libattr1/copyright\
"
