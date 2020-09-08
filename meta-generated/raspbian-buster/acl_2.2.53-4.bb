PACKAGES = "${PN} libacl1"
PROVIDES = "libacl1"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/a/acl/libacl1_2.2.53-4_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libacl1 = "libacl1_2.2.53-4_armhf.deb"
SRC_URI[deb0.sha256sum] = "ac3c4e31891f84033abe9180a2ac977aca8bac36c7b952d1d1ca9d648c9bdc33"
SRC_URI[deb0.md5sum] = "31c25257d5318029fcf11a38d8569824"

RDEPENDS_lib${PN}1 = "libattr1 (>= 1:2.4.44) libc6 (>= 2.4)"
DEPENDS = "libattr1 libc6"


inherit deb_group

FILES_libacl1 = " \
    ./usr/lib/arm-linux-gnueabihf/libacl.so.1 \
    ./usr/lib/arm-linux-gnueabihf/libacl.so.1.1.2253 \
    ./usr/share/doc/libacl1/changelog.Debian.gz \
    ./usr/share/doc/libacl1/changelog.gz \
    ./usr/share/doc/libacl1/copyright\
"
