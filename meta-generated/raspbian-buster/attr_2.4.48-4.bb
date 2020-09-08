PACKAGES = "${PN} libattr1"
PROVIDES = "libattr1"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/a/attr/libattr1_2.4.48-4_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libattr1 = "libattr1_2.4.48-4_armhf.deb"
SRC_URI[deb0.sha256sum] = "44e52042589a1f8fd53a53d216a9a141b46496abe82272f8bc0f9c187d408795"
SRC_URI[deb0.md5sum] = "2f4af13d83eb45fa0d84d8f999a2d939"

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
