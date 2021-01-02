PACKAGES = "${PN} libp11-kit0"
PROVIDES = "libp11-kit0"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/p/p11-kit/libp11-kit0_0.23.15-2+deb10u1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libp11-kit0 = "libp11-kit0_0.23.15-2+deb10u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "1fe6536238d021e11ef3be2fa5b0d03de146bc863bf33d8dd82bae0336154751"
SRC_URI[deb0.md5sum] = "41f0736bd83315a2fd901a4d2f35e094"

RDEPENDS_lib${PN}0 = "libc6 (>= 2.28) libffi6 (>= 3.0.4)"
DEPENDS = "libc6 libffi6"


inherit deb_group

FILES_libp11-kit0 = " \
    ./usr/lib/arm-linux-gnueabihf/libp11-kit.so.0 \
    ./usr/lib/arm-linux-gnueabihf/libp11-kit.so.0.3.0 \
    ./usr/share/doc/libp11-kit0/changelog.Debian.gz \
    ./usr/share/doc/libp11-kit0/changelog.gz \
    ./usr/share/doc/libp11-kit0/copyright \
    ./usr/share/doc/libp11-kit0/examples/pkcs11.conf.example\
"
