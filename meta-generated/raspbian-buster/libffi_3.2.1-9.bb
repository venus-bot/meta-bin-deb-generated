PACKAGES = "${PN} libffi-dev libffi6"
PROVIDES = "libffi-dev libffi6"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libf/libffi/libffi-dev_3.2.1-9_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/libf/libffi/libffi6_3.2.1-9_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libffi-dev = "libffi-dev_3.2.1-9_armhf.deb"
SRC_URI[deb0.sha256sum] = "094236c2efc98622b1ea267a9e32b1d9204fb99f703d632c7291322ed67c410f"
SRC_URI[deb0.md5sum] = "25ba69144a0a45c138f496e89e407c3a"
DEBFILENAME_libffi6 = "libffi6_3.2.1-9_armhf.deb"
SRC_URI[deb1.sha256sum] = "dd24f5e9fa15e16c80c8a13869d63f1a1fbef153b63c628d09f9bc4ed513112e"
SRC_URI[deb1.md5sum] = "6c42f0a4efc84b5970df257064809860"

RDEPENDS_${PN}-dev = "dpkg (>= 1.15.4) libffi6 (= 3.2.1-9)"
RDEPENDS_${PN}6 = "libc6 (>= 2.7) libgcc1 (>= 1:3.5)"
DEPENDS = "dpkg libc6 libgcc1"


inherit deb_group

FILES_${PN}-dev = " \
    ./usr/include/arm-linux-gnueabihf/ffi.h \
    ./usr/include/arm-linux-gnueabihf/ffitarget.h \
    ./usr/lib/arm-linux-gnueabihf/libffi.a \
    ./usr/lib/arm-linux-gnueabihf/libffi.so \
    ./usr/lib/arm-linux-gnueabihf/libffi_pic.a \
    ./usr/lib/arm-linux-gnueabihf/pkgconfig/libffi.pc \
    ./usr/share/doc-base/libffi \
    ./usr/share/doc/libffi-dev \
    ./usr/share/doc/libffi6/ChangeLog.libffi-3.1.gz \
    ./usr/share/doc/libffi6/ChangeLog.libffi.gz \
    ./usr/share/doc/libffi6/ChangeLog.libgcj \
    ./usr/share/doc/libffi6/ChangeLog.v1.gz \
    ./usr/share/doc/libffi6/changelog.gz \
    ./usr/share/doc/libffi6/html/Closure-Example.html \
    ./usr/share/doc/libffi6/html/Complex-Type-Example.html \
    ./usr/share/doc/libffi6/html/Complex.html \
    ./usr/share/doc/libffi6/html/Index.html \
    ./usr/share/doc/libffi6/html/Introduction.html \
    ./usr/share/doc/libffi6/html/Missing-Features.html \
    ./usr/share/doc/libffi6/html/Multiple-ABIs.html \
    ./usr/share/doc/libffi6/html/Primitive-Types.html \
    ./usr/share/doc/libffi6/html/Simple-Example.html \
    ./usr/share/doc/libffi6/html/Structures.html \
    ./usr/share/doc/libffi6/html/The-Basics.html \
    ./usr/share/doc/libffi6/html/The-Closure-API.html \
    ./usr/share/doc/libffi6/html/Type-Example.html \
    ./usr/share/doc/libffi6/html/Types.html \
    ./usr/share/doc/libffi6/html/Using-libffi.html \
    ./usr/share/doc/libffi6/html/index.html \
    ./usr/share/info/libffi.info.gz \
    ./usr/share/man/man3/ffi.3.gz \
    ./usr/share/man/man3/ffi_call.3.gz \
    ./usr/share/man/man3/ffi_prep_cif.3.gz \
    ./usr/share/man/man3/ffi_prep_cif_var.3.gz\
"
FILES_libffi6 = " \
    ./usr/lib/arm-linux-gnueabihf/libffi.so.6 \
    ./usr/lib/arm-linux-gnueabihf/libffi.so.6.0.4 \
    ./usr/share/doc/libffi6/changelog.Debian.gz \
    ./usr/share/doc/libffi6/copyright\
"
