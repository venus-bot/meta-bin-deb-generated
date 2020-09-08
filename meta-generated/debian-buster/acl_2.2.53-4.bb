PACKAGES = "${PN} libacl1"
PROVIDES = "libacl1"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/a/acl/libacl1_2.2.53-4_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libacl1 = "libacl1_2.2.53-4_armhf.deb"
SRC_URI[deb0.sha256sum] = "bfaa2a514f8ec1ad1d26bea69e9936fc4caff96a2ac3ecd7de9e56ead95f8ba2"
SRC_URI[deb0.md5sum] = "6fcd604907fe4f442d41d17da4e3716a"

RDEPENDS_lib${PN}1 = "libattr1 (>= 1:2.4.46-8) libc6 (>= 2.4)"
DEPENDS = "libattr1 libc6"


inherit deb_group

FILES_libacl1 = " \
    ./usr/lib/arm-linux-gnueabihf/libacl.so.1 \
    ./usr/lib/arm-linux-gnueabihf/libacl.so.1.1.2253 \
    ./usr/share/doc/libacl1/changelog.Debian.gz \
    ./usr/share/doc/libacl1/changelog.gz \
    ./usr/share/doc/libacl1/copyright\
"
