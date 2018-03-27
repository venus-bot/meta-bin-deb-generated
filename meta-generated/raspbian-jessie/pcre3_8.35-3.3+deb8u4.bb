PACKAGES = "${PN} libpcre3 libpcre3-dev libpcrecpp0"
PROVIDES = "libpcre3 libpcre3-dev libpcrecpp0"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/p/pcre3/libpcre3_8.35-3.3+deb8u4_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/p/pcre3/libpcre3-dev_8.35-3.3+deb8u4_armhf.deb;unpack=0;name=deb1\
	http://archive.raspbian.org/raspbian/pool/main/p/pcre3/libpcrecpp0_8.35-3.3+deb8u4_armhf.deb;unpack=0;name=deb2\
"
DEBFILENAME_libpcre3 = "libpcre3_8.35-3.3+deb8u4_armhf.deb"
SRC_URI[deb0.sha256sum] = "dc4c25aa393477265414fce7cf657e11d325cdbb579db26c4ed789fce543777a"
SRC_URI[deb0.md5sum] = "1346df9c4c2c6e0156ba04298a27a585"
DEBFILENAME_libpcre3-dev = "libpcre3-dev_8.35-3.3+deb8u4_armhf.deb"
SRC_URI[deb1.sha256sum] = "c593cd3ba44902671473617999cae68bb97fdfee670b271460f2ee429b94a70b"
SRC_URI[deb1.md5sum] = "dd40636a15a0e93acb91ac7689742c6a"
DEBFILENAME_libpcrecpp0 = "libpcrecpp0_8.35-3.3+deb8u4_armhf.deb"
SRC_URI[deb2.sha256sum] = "29733988f6a04c61bd8bd6e50d9bc1340f62e747786819d9f436e64bcddf9e63"
SRC_URI[deb2.md5sum] = "e078256efd5ab02d86e6afeca7a7f2e6"

RDEPENDS_lib${PN} = "libc6 (>= 2.4)"
RDEPENDS_lib${PN}-dev = "libc6-dev libpcre3 (= 2:8.35-3.3+deb8u4) libpcrecpp0 (= 2:8.35-3.3+deb8u4)"
RDEPENDS_libpcrecpp0 = "libc6 (>= 2.4) libgcc1 (>= 1:4.4.0) libpcre3 (>= 1:8.35) libstdc++6 (>= 4.3.0)"
DEPENDS = "libstdc++6 libc6-dev libgcc1 libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libpcre3 = " \
    ./lib/arm-linux-gnueabihf/libpcre.so.3 \
    ./lib/arm-linux-gnueabihf/libpcre.so.3.13.1 \
    ./usr/lib/arm-linux-gnueabihf/libpcreposix.so.3 \
    ./usr/lib/arm-linux-gnueabihf/libpcreposix.so.3.13.1 \
    ./usr/share/doc/libpcre3/AUTHORS \
    ./usr/share/doc/libpcre3/NEWS.gz \
    ./usr/share/doc/libpcre3/README.Debian \
    ./usr/share/doc/libpcre3/README.gz \
    ./usr/share/doc/libpcre3/changelog.Debian.gz \
    ./usr/share/doc/libpcre3/changelog.gz \
    ./usr/share/doc/libpcre3/copyright \
    ./usr/share/man/man3/pcrepattern.3.gz\
"
FILES_libpcre3-dev = " \
    ./usr/bin/pcre-config \
    ./usr/include/pcre.h \
    ./usr/include/pcre_scanner.h \
    ./usr/include/pcre_stringpiece.h \
    ./usr/include/pcrecpp.h \
    ./usr/include/pcrecpparg.h \
    ./usr/include/pcreposix.h \
    ./usr/lib/arm-linux-gnueabihf/libpcre.a \
    ./usr/lib/arm-linux-gnueabihf/libpcre.so \
    ./usr/lib/arm-linux-gnueabihf/libpcrecpp.a \
    ./usr/lib/arm-linux-gnueabihf/libpcrecpp.so \
    ./usr/lib/arm-linux-gnueabihf/libpcreposix.a \
    ./usr/lib/arm-linux-gnueabihf/libpcreposix.so \
    ./usr/lib/arm-linux-gnueabihf/pkgconfig/libpcre.pc \
    ./usr/lib/arm-linux-gnueabihf/pkgconfig/libpcrecpp.pc \
    ./usr/lib/arm-linux-gnueabihf/pkgconfig/libpcreposix.pc \
    ./usr/share/doc/libpcre3-dev/changelog.Debian.gz \
    ./usr/share/doc/libpcre3-dev/changelog.gz \
    ./usr/share/doc/libpcre3-dev/copyright \
    ./usr/share/doc/libpcre3-dev/examples/pcredemo.c.gz \
    ./usr/share/man/man1/pcre-config.1.gz \
    ./usr/share/man/man3/pcre.3.gz \
    ./usr/share/man/man3/pcre16.3.gz \
    ./usr/share/man/man3/pcre16_assign_jit_stack.3.gz \
    ./usr/share/man/man3/pcre16_compile.3.gz \
    ./usr/share/man/man3/pcre16_compile2.3.gz \
    ./usr/share/man/man3/pcre16_config.3.gz \
    ./usr/share/man/man3/pcre16_copy_named_substring.3.gz \
    ./usr/share/man/man3/pcre16_copy_substring.3.gz \
    ./usr/share/man/man3/pcre16_dfa_exec.3.gz \
    ./usr/share/man/man3/pcre16_exec.3.gz \
    ./usr/share/man/man3/pcre16_free_study.3.gz \
    ./usr/share/man/man3/pcre16_free_substring.3.gz \
    ./usr/share/man/man3/pcre16_free_substring_list.3.gz \
    ./usr/share/man/man3/pcre16_fullinfo.3.gz \
    ./usr/share/man/man3/pcre16_get_named_substring.3.gz \
    ./usr/share/man/man3/pcre16_get_stringnumber.3.gz \
    ./usr/share/man/man3/pcre16_get_stringtable_entries.3.gz \
    ./usr/share/man/man3/pcre16_get_substring.3.gz \
    ./usr/share/man/man3/pcre16_get_substring_list.3.gz \
    ./usr/share/man/man3/pcre16_jit_exec.3.gz \
    ./usr/share/man/man3/pcre16_jit_stack_alloc.3.gz \
    ./usr/share/man/man3/pcre16_jit_stack_free.3.gz \
    ./usr/share/man/man3/pcre16_maketables.3.gz \
    ./usr/share/man/man3/pcre16_pattern_to_host_byte_order.3.gz \
    ./usr/share/man/man3/pcre16_refcount.3.gz \
    ./usr/share/man/man3/pcre16_study.3.gz \
    ./usr/share/man/man3/pcre16_utf16_to_host_byte_order.3.gz \
    ./usr/share/man/man3/pcre16_version.3.gz \
    ./usr/share/man/man3/pcre32.3.gz \
    ./usr/share/man/man3/pcre32_assign_jit_stack.3.gz \
    ./usr/share/man/man3/pcre32_compile.3.gz \
    ./usr/share/man/man3/pcre32_compile2.3.gz \
    ./usr/share/man/man3/pcre32_config.3.gz \
    ./usr/share/man/man3/pcre32_copy_named_substring.3.gz \
    ./usr/share/man/man3/pcre32_copy_substring.3.gz \
    ./usr/share/man/man3/pcre32_dfa_exec.3.gz \
    ./usr/share/man/man3/pcre32_exec.3.gz \
    ./usr/share/man/man3/pcre32_free_study.3.gz \
    ./usr/share/man/man3/pcre32_free_substring.3.gz \
    ./usr/share/man/man3/pcre32_free_substring_list.3.gz \
    ./usr/share/man/man3/pcre32_fullinfo.3.gz \
    ./usr/share/man/man3/pcre32_get_named_substring.3.gz \
    ./usr/share/man/man3/pcre32_get_stringnumber.3.gz \
    ./usr/share/man/man3/pcre32_get_stringtable_entries.3.gz \
    ./usr/share/man/man3/pcre32_get_substring.3.gz \
    ./usr/share/man/man3/pcre32_get_substring_list.3.gz \
    ./usr/share/man/man3/pcre32_jit_exec.3.gz \
    ./usr/share/man/man3/pcre32_jit_stack_alloc.3.gz \
    ./usr/share/man/man3/pcre32_jit_stack_free.3.gz \
    ./usr/share/man/man3/pcre32_maketables.3.gz \
    ./usr/share/man/man3/pcre32_pattern_to_host_byte_order.3.gz \
    ./usr/share/man/man3/pcre32_refcount.3.gz \
    ./usr/share/man/man3/pcre32_study.3.gz \
    ./usr/share/man/man3/pcre32_utf32_to_host_byte_order.3.gz \
    ./usr/share/man/man3/pcre32_version.3.gz \
    ./usr/share/man/man3/pcre_assign_jit_stack.3.gz \
    ./usr/share/man/man3/pcre_compile.3.gz \
    ./usr/share/man/man3/pcre_compile2.3.gz \
    ./usr/share/man/man3/pcre_config.3.gz \
    ./usr/share/man/man3/pcre_copy_named_substring.3.gz \
    ./usr/share/man/man3/pcre_copy_substring.3.gz \
    ./usr/share/man/man3/pcre_dfa_exec.3.gz \
    ./usr/share/man/man3/pcre_exec.3.gz \
    ./usr/share/man/man3/pcre_free_study.3.gz \
    ./usr/share/man/man3/pcre_free_substring.3.gz \
    ./usr/share/man/man3/pcre_free_substring_list.3.gz \
    ./usr/share/man/man3/pcre_fullinfo.3.gz \
    ./usr/share/man/man3/pcre_get_named_substring.3.gz \
    ./usr/share/man/man3/pcre_get_stringnumber.3.gz \
    ./usr/share/man/man3/pcre_get_stringtable_entries.3.gz \
    ./usr/share/man/man3/pcre_get_substring.3.gz \
    ./usr/share/man/man3/pcre_get_substring_list.3.gz \
    ./usr/share/man/man3/pcre_jit_exec.3.gz \
    ./usr/share/man/man3/pcre_jit_stack_alloc.3.gz \
    ./usr/share/man/man3/pcre_jit_stack_free.3.gz \
    ./usr/share/man/man3/pcre_maketables.3.gz \
    ./usr/share/man/man3/pcre_pattern_to_host_byte_order.3.gz \
    ./usr/share/man/man3/pcre_refcount.3.gz \
    ./usr/share/man/man3/pcre_study.3.gz \
    ./usr/share/man/man3/pcre_utf16_to_host_byte_order.3.gz \
    ./usr/share/man/man3/pcre_utf32_to_host_byte_order.3.gz \
    ./usr/share/man/man3/pcre_version.3.gz \
    ./usr/share/man/man3/pcreapi.3.gz \
    ./usr/share/man/man3/pcrebuild.3.gz \
    ./usr/share/man/man3/pcrecallout.3.gz \
    ./usr/share/man/man3/pcrecompat.3.gz \
    ./usr/share/man/man3/pcrecpp.3.gz \
    ./usr/share/man/man3/pcredemo.3.gz \
    ./usr/share/man/man3/pcrejit.3.gz \
    ./usr/share/man/man3/pcrelimits.3.gz \
    ./usr/share/man/man3/pcrematching.3.gz \
    ./usr/share/man/man3/pcrepartial.3.gz \
    ./usr/share/man/man3/pcreperform.3.gz \
    ./usr/share/man/man3/pcreposix.3.gz \
    ./usr/share/man/man3/pcreprecompile.3.gz \
    ./usr/share/man/man3/pcresample.3.gz \
    ./usr/share/man/man3/pcrestack.3.gz \
    ./usr/share/man/man3/pcresyntax.3.gz \
    ./usr/share/man/man3/pcreunicode.3.gz\
"
FILES_libpcrecpp0 = " \
    ./usr/lib/arm-linux-gnueabihf/libpcrecpp.so.0 \
    ./usr/lib/arm-linux-gnueabihf/libpcrecpp.so.0.0.0 \
    ./usr/share/doc/libpcrecpp0/AUTHORS \
    ./usr/share/doc/libpcrecpp0/NEWS.gz \
    ./usr/share/doc/libpcrecpp0/README.gz \
    ./usr/share/doc/libpcrecpp0/changelog.Debian.gz \
    ./usr/share/doc/libpcrecpp0/changelog.gz \
    ./usr/share/doc/libpcrecpp0/copyright\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
